package company.implementations;

import company.interfaces.Messenger;

public class EmailMessenger implements Messenger {

    @Override
    public void sendMessage(String message) {
        System.out.println("I am sending an e-mail message: " + message);
    }
}
