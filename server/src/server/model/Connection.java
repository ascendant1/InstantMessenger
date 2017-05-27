package server.model;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * Created by Darkie on 27.05.2017.
 */
public class Connection {
    private ServerSocket socket;
    private User user;

    public Connection (int port) {
        try {
            this.socket = new ServerSocket(port);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public void sendMessage(String msg) {

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
