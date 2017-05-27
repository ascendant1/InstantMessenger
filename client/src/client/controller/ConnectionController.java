package client.controller;

import client.model.Connection;

/**
 * Created by Darkie on 27.05.2017.
 */
public class ConnectionController implements Controller {
    private String serverAddress;
    private int serverPort;
    private Connection connection;

    public void createConnection(String serverAddress, int serverPort) {
        this.serverAddress = serverAddress;
        this.serverPort = serverPort;
        this.connection = new Connection(serverAddress, serverPort);
    }

    public String getServerAddress() {
        return serverAddress;
    }

    public void setServerAddress(String serverAddress) {
        this.serverAddress = serverAddress;
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
