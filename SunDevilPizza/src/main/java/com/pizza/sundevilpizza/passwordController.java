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
    public passwordController() {

    }

    @FXML
    private Button login;
    @FXML
    private Label wrongLogin;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    // This is a password check function that is a work in progress, it must be implemented into main
/*    public void passwordController(ActionEvent event) throws IOException {
        checkLogin();
    }

  private void checkLogin() throws IOException {
        Main m = new Main();
        if(username.getText.toString().equals("rom2132897") && password.getText.toString(equals("123"))) {
          wrongLogin.setText("Welcome! Your food awaits!");

          FXMLLoader fxmlLoader = new FXMLLoader(SunDevilPizzaApplication.class.getResource("order_status_page.fxml"));
      }
        else if(username.getText.isEmpty() && password.getText.isEmpty()) {
            wrongLogin.setText("User ID and Password is required. Please try again!");
        }

        else{
            wrongLogin.setText("Invalid ASURITE User ID or Password! Please try again.");
      }
  }*/






}



