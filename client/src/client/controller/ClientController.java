package client.controller;

import client.view.ClientView;

/**
 * Created by Darkie on 27.05.2017.
 */
public class ClientController implements Controller {
    private ConnectionController connectionController;
    private ClientView mainView;

    public static void main(String[] args) {
        System.out.println("Client started");
    }

    public void setConnection(ClientView mainView) {
        String serverAddressFromConfigOrView = "localhost"; //Тут будущем будет адрес сервера из конфигов или из интерфейса
        int serverPortFromConfigOrView = 1234; //Тут будущем будет порт сервера из конфигов или из интерфейса
        connectionController.createConnection(serverAddressFromConfigOrView, serverPortFromConfigOrView);
    }
}
