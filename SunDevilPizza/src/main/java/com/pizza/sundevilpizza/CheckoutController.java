package com.pizza.sundevilpizza;

import Functions.Order;
import Functions.Pizza;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;


public class CheckoutController {
    private Stage stage;
    private Scene scene;
    private Pizza newPizza;
    private ChooseToppingsController pizzaToppingControl;
    @FXML
    private Label pizza_name;



    public void setCheckoutLabel(String text) {
        //newPizza = pizzaToppingControl.getPizza();
        //pizza_name.setText(newPizza.getType());
        pizza_name.setText(text);
    }


    // Link "Student" Button to Next Scene
    public void switchToOrderStatus(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SunDevilPizzaApplication.class.getResource("order_status_page.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load(), 900, 600);
        stage.setTitle("SunDevil Pizza");
        stage.setScene(scene);
        stage.show();
    }

    public void backToToppingsPage(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SunDevilPizzaApplication.class.getResource("choose_toppings_page.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load(), 900, 600);
        stage.setTitle("SunDevil Pizza");
        stage.setScene(scene);
        stage.show();
    }

}
