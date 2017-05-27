package server.controller;

import server.model.Connection;

/**
 * Created by Darkie on 27.05.2017.
 */
public class ConnectionController implements Controller {
    private int serverPort;
    private Connection connection;

    public void startConnection(int serverPort) {
        this.serverPort = serverPort;
        this.connection = new Connection(serverPort);
    }

    public int getServerPort() {
        return serverPort;
    }

    public void setServerPort(int serverPort) {
        this.serverPort = serverPort;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
