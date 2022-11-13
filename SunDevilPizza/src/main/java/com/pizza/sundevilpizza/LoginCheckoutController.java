package com.pizza.sundevilpizza;

import Functions.Pizza;
import Functions.ProcessingAgent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginCheckoutController {
    private Stage stage;

    private Scene scene;
    private Pizza newPizza;
    @FXML
    private TextField asurite_field;
    @FXML
    private PasswordField password_field;


    public void backToCheckout(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SunDevilPizzaApplication.class.getResource("checkout_page.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load(), 900, 600);

        // pass pizza object to next scene
        CheckoutController control = fxmlLoader.getController();
        control.setCheckoutPizza(newPizza); // set pizza for checkout page

        //stage.setTitle("SunDevil Pizza");
        stage.setScene(scene);
        //stage.show();
    }

    public void handleSubmit(ActionEvent event) throws IOException {


    }

    public void setPizza(Pizza pizza){
        newPizza = pizza;
    }
}
