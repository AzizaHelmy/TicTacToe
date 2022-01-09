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

/**
 *
 * @author Azza Helmy
 */

public class ClientSocket {

    private static Socket socket;
    private static String ip;
    private static ObjectInputStream objectInputStream;
    private static ObjectOutputStream objectOutputStream;
    private static InputStream inputStream;
    private static OutputStream outputStream;

    public static void setIp(String s) {
        ip = s;
    }

    public static synchronized Socket getSocketInstance() throws IOException {
        if (socket == null || socket.isClosed()) {
            socket = new Socket(ip, 5005);
            inputStream = socket.getInputStream();
            outputStream = socket.getOutputStream();
        }
        return socket;
    }

    public static synchronized ObjectOutputStream getObjectOutputStreamInstance() throws IOException {
        if (objectOutputStream == null && socket.isConnected()) {
            objectOutputStream = new ObjectOutputStream(outputStream);
        }
        return objectOutputStream;
    }

    public static synchronized ObjectInputStream getObjectInputStreamInstance() throws IOException {
        if (objectInputStream == null && socket.isConnected()) {
            objectInputStream = new ObjectInputStream(inputStream);
        }
        return objectInputStream;
    }

    
    public static synchronized void closeSocket() throws IOException {
        outputStream.close();
        inputStream.close();
        socket.close();
    }

}
