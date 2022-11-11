package com.pizza.sundevilpizza;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartUpController {
    private Stage stage;
    private Scene scene;

    // Link "Student" Button to Next Scene
    public void switchToCustomerPage(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SunDevilPizzaApplication.class.getResource("initial_customer_page.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load(), 900, 600);
        stage.setTitle("SunDevil Pizza");
        stage.setScene(scene);
        stage.show();
    }

    // Link "Chef" Button to Next Scene
    public void toChefPage(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader2 = new FXMLLoader(SunDevilPizzaApplication.class.getResource("passwordCheck.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader2.load(), 900, 600);
        stage.setTitle("SunDevil Pizza");
        stage.setScene(scene);
        stage.show();
    }
    // Link "Processing Agent" Button to Next Scene
}
