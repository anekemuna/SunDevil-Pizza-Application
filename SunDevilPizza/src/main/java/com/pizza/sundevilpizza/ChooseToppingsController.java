package com.pizza.sundevilpizza;

import Functions.Pizza;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

import java.io.IOException;

public class ChooseToppingsController {
    private Stage stage;
    private Scene scene;
    private Pizza newPizza;


    // Link "Student" Button to Next Scene
    public void switchToCheckOut(ActionEvent event) throws IOException {
        // switch new order
        FXMLLoader fxmlLoader = new FXMLLoader(SunDevilPizzaApplication.class.getResource("checkout_page.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load(), 900, 600);
        //stage.setTitle("SunDevil Pizza");

        // set Pizza Labels for CheckOutPage
        CheckoutController control = fxmlLoader.getController();
        control.setCheckoutPizza(newPizza); // set pizza for checkout page


        stage.setScene(scene);
        //stage.show();
    }

    public void backToPizzaPage(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SunDevilPizzaApplication.class.getResource("choose_pizza_page.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load(), 900, 600);
        //stage.setTitle("SunDevil Pizza");
        stage.setScene(scene);
        //stage.show();
    }

   public void handleCheckBox(ActionEvent event) throws IOException {Node node = (Node) event.getSource();
       /*Stage stage = (Stage) node.getScene().getWindow();
       newPizza = (Pizza) stage.getUserData();*/
       CheckBox box = (CheckBox) event.getSource();

       if(box.isSelected())
       {
           newPizza.addToppings(box.getText());
       }
       else if(!box.isSelected()) // remove unselected
       {
           newPizza.returnToppingList().remove(box.getText());
       }

       // might need to add a removeToppings() to Pizza: inCase a customer changes their minds
       // what happens if no pizza topping
   }

    public void setPizza(Pizza pizza){
        newPizza = pizza;
    }

}
