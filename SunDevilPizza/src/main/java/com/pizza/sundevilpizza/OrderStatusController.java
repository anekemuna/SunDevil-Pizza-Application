package com.pizza.sundevilpizza;

import Functions.Customer;
import Functions.Order;
import Functions.Pizza;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class OrderStatusController extends Customer {
    private Stage stage;
    private Scene scene;
    private Pizza newPizza;
    private String name;
    @FXML
    private Label statusLabel;
    @FXML
    private Label statusLabel2;

    // Link any pizza Button to Next Scene
    public void switchToStartUpPage(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SunDevilPizzaApplication.class.getResource("startup_page.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load(), 900, 600);
        stage.setTitle("SunDevil Pizza");
        stage.setScene(scene);
        stage.show();

    }

    public void setCustomerName (String newName, int flagOrder)
    {
        name = newName;

        int orderIndex = list.findOrder(name);

        if(orderIndex >= 0 && orderIndex < list.getSize() && flagOrder == 0)
        {
            Order customerOrder = list.getOrder(orderIndex);
            statusLabel.setText(customerOrder.getStatus());
        }
        else if(flagOrder == 1 && orderIndex >= 0 && orderIndex < list.getSize())
        {
            statusLabel.setText("You Have an Incomplete Order!");
            statusLabel2.setText("Try Again Later!");
        }
        else
        {
            statusLabel.setText("You Have No Existing Order!");
        }




    }


}
