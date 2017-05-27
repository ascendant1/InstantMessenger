package server.view;

/**
 * Created by Darkie on 27.05.2017.
 */
public class ConsoleView implements ServerView{
    public void sendMessage(String msg) {
        System.out.println(msg);
    }
}
