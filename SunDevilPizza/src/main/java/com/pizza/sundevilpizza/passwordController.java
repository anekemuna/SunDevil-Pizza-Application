package com.pizza.sundevilpizza;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class passwordController {
    private Stage stage;
    private Scene scene;
    @FXML
    private PasswordField password;

    public void submitProcess(ActionEvent event) throws IOException {
        String input = password.getText();
        if (input.equals("pizza")) {
            FXMLLoader fxmlLoader2 = new FXMLLoader(SunDevilPizzaApplication.class.getResource("orderProcess.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(fxmlLoader2.load(), 900, 600);
            stage.setTitle("SunDevil Pizza");
            stage.setScene(scene);
            stage.show();
        } else {
            password.clear();
            password.setPromptText("Incorrect Password");
        }


    }
}



