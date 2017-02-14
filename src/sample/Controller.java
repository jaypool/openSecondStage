package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    public void startAnother(ActionEvent actionEvent) throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("sample2.fxml"));
        Parent content = (Parent) loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(content));
        stage.show();

    }
}



