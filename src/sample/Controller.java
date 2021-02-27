package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {

    private String userName = "Daria";

    @FXML
    TextArea chat;

    @FXML
    TextField message;

    public void sendMsg() {
        if (message.getLength() > 0) {
            chat.appendText(userName + ":\n" + message.getText() + "\n\n");
            message.clear();
        }
    }
}
