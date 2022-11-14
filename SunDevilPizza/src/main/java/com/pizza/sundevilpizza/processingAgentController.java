package com.pizza.sundevilpizza;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.*;
import Functions.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Functions.Staff;

public class processingAgentController extends ProcessingAgent {
    private Stage stage;

    private Scene scene;

    @FXML
    private Button sendToChef;

    @FXML
    private Button back;

    @FXML
    private ListView processList;



    /*public void chefReady(ActionEvent event) throws IOException {
           changeStatus(name, "Cooking");
           sendToChef(Order order);
    }*/



    public void toWelcomePage(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SunDevilPizzaApplication.class.getResource("startup_page.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load(), 900, 600);
        stage.setTitle("SunDevil Pizza");
        stage.setScene(scene);
        stage.show();
    }

   /* public void customerOrder(){

        for(int i = 0; i < list.getSize(); i++) {
        Order current = new Order();
        current = list.getOrder(i);
        String orderName = current.getName();
        String pizzaType = current.getPizza().getType();
        String pizzaToppings = current.getPizza().getToppings();
        Pane pane = new Pane();
        pane = processPane(orderName, pizzaType, pizzaToppings);
        processList.getItems().add(pane);
    }
    }*/
}
