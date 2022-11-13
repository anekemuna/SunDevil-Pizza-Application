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

    @FXML
    private Label pizza_name;
    @FXML
    private Label topping_1;
    @FXML
    private Label topping_2;
    @FXML
    private Label topping_3;
    @FXML
    private Label topping_4;

    @FXML
    private Label topping_price1;
    @FXML
    private Label topping_price2;
    @FXML
    private Label topping_price3;
    @FXML
    private Label topping_price4;
    @FXML
    private Label total_price;



    public void setCheckoutPizza(Pizza pizza) {
        newPizza = pizza; // set pizza

        // set label values
        pizza_name.setText(newPizza.getType());

        // fix topping labels
        if(!newPizza.returnToppingList().isEmpty())
        {
            switch(newPizza.returnToppingList().size()) {
                case 1:
                    topping_1.setText(newPizza.returnToppingList().get(0));
                    topping_price1.setText("$1.50");
                    topping_2.setText("");
                    topping_price2.setText("");
                    topping_3.setText("");
                    topping_price3.setText("");
                    topping_4.setText("");
                    topping_price4.setText("");
                    break;
                case 2:
                    topping_1.setText(newPizza.returnToppingList().get(0));
                    topping_price1.setText("$1.50");
                    topping_2.setText(newPizza.returnToppingList().get(1));
                    topping_price2.setText("$1.50");
                    topping_3.setText("");
                    topping_price3.setText("");
                    topping_4.setText("");
                    topping_price4.setText("");
                    break;
                case 3:
                    topping_1.setText(newPizza.returnToppingList().get(0));
                    topping_price1.setText("$1.50");
                    topping_2.setText(newPizza.returnToppingList().get(1));
                    topping_price2.setText("$1.50");
                    topping_1.setText(newPizza.returnToppingList().get(2));
                    topping_price3.setText("$1.50");
                    topping_4.setText("");
                    topping_price4.setText("");
                    break;
                case 4:
                    topping_1.setText(newPizza.returnToppingList().get(0));
                    topping_price1.setText("$1.50");
                    topping_2.setText(newPizza.returnToppingList().get(1));
                    topping_price2.setText("$1.50");
                    topping_3.setText(newPizza.returnToppingList().get(2));
                    topping_price3.setText("$1.50");
                    topping_4.setText(newPizza.returnToppingList().get(3));
                    topping_price4.setText("$1.50");
                    break;
                default:
                    break;
            }

        }

        // total price label
        double price = 20.00 + (newPizza.returnToppingList().size() * 1.50);
        String str_price
        total_price.setText(String.valueOf(price));


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
