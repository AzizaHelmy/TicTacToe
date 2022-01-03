/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Azza Helmy
 */
public class ClientSocket {

    private static Socket socketObj;

    public static synchronized Socket getInstance(String ip) {
        if (socketObj == null) {
            try {
                socketObj = new Socket(ip, 5555);
            } catch (IOException ex) {
                Logger.getLogger(ClientSocket.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return socketObj;
    }

}
