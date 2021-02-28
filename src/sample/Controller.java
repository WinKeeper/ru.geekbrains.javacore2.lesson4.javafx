package sample;

//VBox fx:controller="sample.Controller" для понимаю с каким fxml файлом мы работаем

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea; //импорт класса
import javafx.scene.control.TextField;

public class Controller {
    @FXML //связываем элементы через fx:id с контроллером
    TextArea mainTextArea; //javafx.scene.control при нажатии на Alt+Enter

    @FXML //связываем элементы через fx:id с контроллером
    TextField messageField;
    //onAction="#clickSendMessage" для текстого поля это Enter


    public void clickSendMessage() {
        if (!messageField.getText().isEmpty()) {
            mainTextArea.appendText(messageField.getText() + "\n");
            messageField.clear();
        }
    }

}
