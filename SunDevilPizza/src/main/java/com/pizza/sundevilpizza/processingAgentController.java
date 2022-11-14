package com.pizza.sundevilpizza;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.*;
import Functions.*;
import java.io.IOException;
import Functions.Staff;

public class processingAgentController extends Staff {
    private Stage stage;

    private Scene scene;

    @FXML
    private Button sendToChef;

    @FXML
    private Button back;

    // Implementing table population using Order class
    @FXML
    private TableView<Order> table;

    @FXML
    private TableView<Order> name;

    @FXML
    private TableView<Order> pizza;


    public void chefReady(ActionEvent event) throws IOException {
     //   changeStatus(name, "Ready to Cook");
     //   sendToChef(Order order);
    }

    public void toWelcomePage(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SunDevilPizzaApplication.class.getResource("startup_page.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load(), 900, 600);
        stage.setTitle("SunDevil Pizza");
        stage.setScene(scene);
        stage.show();
    }
}
