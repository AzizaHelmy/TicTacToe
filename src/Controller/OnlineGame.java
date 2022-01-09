/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
    private ObjectOutputStream objectOutputStream;
    private Thread th;
    public static Player player;
    public Move move;

    public OnlineGame(Player p) {
        player = p;
        try {
            objectInputStream = ClientSocket.getObjectInputStreamInstance();
            objectOutputStream = ClientSocket.getObjectOutputStreamInstance();
            move = new Move();
        } catch (IOException ex) {
            Logger.getLogger(OnlineGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void setPosition(int position) {
        setPlayingIcon(imags.get(position), buttons.get(position));
        xoPane.setDisable(true);
        writeToServer(position);
    }

    @Override
    public void GameSession() {
        th = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Move move = (Move) objectInputStream.readObject();
                        setPlayingIcon(imags.get(move.getX()), buttons.get(move.getX()));
                        xoPane.setDisable(false);
                    } catch (SocketException | EOFException s) {
                        try {
                            ClientSocket.closeSocket();
                            pop.showErrorInServer();
                            s.printStackTrace();
                        } catch (IOException ex) {
                            Logger.getLogger(OnlineGame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } catch (IOException | ClassNotFoundException ex) {
                        Logger.getLogger(OnlineGame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        th.start();
    }
    
    public void writeToServer(int position){
        move.setX(position);
        move.setTurn(changeTurn);
        System.out.println("sent move: " + move);
        try {
            objectOutputStream.writeObject(move);
            objectOutputStream.flush();
        } catch (SocketException | EOFException s) {
            try {
                ClientSocket.closeSocket();
                s.printStackTrace();
                pop.showErrorInServer();
            } catch (IOException ex) {
                Logger.getLogger(OnlineGame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(OnlineGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
