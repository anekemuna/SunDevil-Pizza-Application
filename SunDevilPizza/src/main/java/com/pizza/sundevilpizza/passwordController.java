package com.pizza.sundevilpizza;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class passwordController {

    public passwordController() {

    }

    @FXML
    private Button login;
    @FXML
    private Label wrongLogin;
    @FXML
    private TExtField username;
    @FXML
    private PasswordField password;

    public void passwordController(ActionEvent event) throws IOException {
        checkLogin();
    }

  private void checkLogin() throws IOException {
        Main m = new Main();
        if(username.getText.toString().equals("rom2132897") && password.getText.toString(equals("123"))) {
          wrongLogin.setText("Welcome! Your food awaits!");

          m.changeScene("order_status_page.fxml");
      }
        else if(username.getText.isEmpty() && password.getText.isEmpty()) {
            wrongLogin.setText("User ID and Password is required. Please try again!");
        }

        else{
            wrongLogin.setText("Invalid ASURITE User ID or Password! Please try again.");
      }
  }






}



