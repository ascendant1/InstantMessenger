package client.model;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by Darkie on 27.05.2017.
 */
public class Connection {
    private Socket socket;
    private User user;

    public Connection (String address, int port) {
        try {
            this.socket = new Socket(address, port);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public void sendMessage(String msg) {

    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
