package com.pizza.sundevilpizza;

import Functions.Pizza;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ChoosePizzaController {
    private Stage stage;
    private Scene scene;
    private Pizza newPizza;

    // Link any pizza Button to Next Scene
    public void switchToToppingPage(ActionEvent event) throws IOException {

        // handle button event
        String pizzaType = ((Button)event.getSource()).getText();
        newPizza = new Pizza();
        newPizza.setType(pizzaType);  // set pizza name to selected button

        // switch to next page
        FXMLLoader fxmlLoader = new FXMLLoader(SunDevilPizzaApplication.class.getResource("choose_toppings_page.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load(), 900, 600);
        stage.setTitle("SunDevil Pizza");
        //stage.setUserData(newPizza); // store newPizza data for next scene
        newPizza.removeToppings();
        ChooseToppingsController control = fxmlLoader.getController();
        control.setPizza(newPizza); // set pizza for checkout page
        stage.setScene(scene);
        stage.show();
    }

    public void backToInitialPage(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SunDevilPizzaApplication.class.getResource("initial_customer_page.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load(), 900, 600);
        stage.setTitle("SunDevil Pizza");
        stage.setScene(scene);
        stage.show();
    }


}
