package sample;

//VBox fx:controller="sample.Controller" для понимаю с каким fxml файлом мы работаем

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea; //импорт класса
import javafx.scene.control.TextField;
import javafx.scene.image.Image;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Controller {
    @FXML //связываем элементы через fx:id с контроллером
    TextArea mainTextArea; //javafx.scene.control при нажатии на Alt+Enter

    @FXML //связываем элементы через fx:id с контроллером
    TextField messageField;
    //onAction="#clickSendMessage" для текстого поля это Enter

    public void clickSendMessage() {
        if (!messageField.getText().isEmpty()) {
            mainTextArea.appendText("Время сообщения: " + new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()) + "\n");
            mainTextArea.appendText(messageField.getText() + "\n");
            messageField.clear();
        }
    }

}
