/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Move;
import model.Player;

/**
 *
 * @author zoz
 */
public class OnlineGame extends GameHelper {

    private ObjectInputStream objectInputStream;

    private Thread th;
    public static Player player;
    private PopUp pop = new PopUp();
    public OnlineGame(Player p) {
        player = p;
        try {
            objectInputStream = ClientSocket.getObjectInputStreamInstance();
        } catch (IOException ex) {
            Logger.getLogger(OnlineGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void GameSession() {
        th = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Object readObj = objectInputStream.readObject();
                        System.out.println("received move: " + readObj);
                        if (readObj instanceof Move) {
                            Move move = (Move) readObj;
                            System.out.println(move.getPlayer1() + " , " + move.getPlayer2());
                            if (player.getUserName().equals(onlinePlayersScreenBase.nameOfPlayer1) && move.isTurn()) {
                                setPlayingIcon(imags.get(move.getX()), buttons.get(move.getX()));
//                                xoPane.setDisable(false);
                            } else if (player.getUserName().equals(onlinePlayersScreenBase.nameOfPlayer2) && move.isTurn()) {
                                setPlayingIcon(imags.get(move.getX()), buttons.get(move.getX()));
//                                xoPane.setDisable(false);
                            }
                        }
                    } catch (SocketException s) {
                        pop.showErrorInServer();
                    } catch (EOFException e) {
                        pop.showErrorInServer();
                    } catch (IOException ex) {
                        Logger.getLogger(OnlineGame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(OnlineGame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        th.start();
    }
}