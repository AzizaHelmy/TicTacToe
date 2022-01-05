/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Azza Helmy
 */
public class ClientSocket {

    private static Socket socket;
    private static String ip;

    public static void setIp(String ip) {
        ClientSocket.ip = ip;
    }

    public static synchronized Socket getInstance() throws IOException {
        if (socket == null || socket.isClosed()) {

            socket = new Socket(ip, 5555);

        }
        return socket;
    }

}
