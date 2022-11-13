//by YungLing Liu
package com.pizza.sundevilpizza;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class passwordCheckController {
    private Stage stage;
    private Scene scene;

    @FXML
    private TextField passwordInput;

    // Back: go to welcome page
    public void toWelcomPage(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SunDevilPizzaApplication.class.getResource("startup_page.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load(), 900, 600);
        stage.setTitle("SunDevil Pizza");
        stage.setScene(scene);
        stage.show();
    }

    // Submit: when clicked, it will retrieve the password input. If correct it will go to chef page.
    //If incorrect password -> display prompt incorrect password
    //the password to chef page is "I'maChef"
    public void submit(ActionEvent event) throws IOException {
        String input = passwordInput.getText();
        if (input.equals("I'maChef")){
            FXMLLoader fxmlLoader2 = new FXMLLoader(SunDevilPizzaApplication.class.getResource("ChefPage.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(fxmlLoader2.load(), 900, 600);
            stage.setTitle("SunDevil Pizza");
            stage.setScene(scene);
            stage.show();
        }
        else{
            passwordInput.clear();
            passwordInput.setPromptText("Incorrect Password");
        }








    }
    // Link "Processing Agent" Button to Next Scene
}