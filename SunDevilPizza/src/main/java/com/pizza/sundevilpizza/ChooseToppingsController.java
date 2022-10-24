package com.pizza.sundevilpizza;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ChooseToppingsController {
    private Stage stage;
    private Scene scene;

    // Link "Student" Button to Next Scene
    public void switchToCheckOut(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SunDevilPizzaApplication.class.getResource("checkout_page.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load(), 900, 600);
        //stage.setTitle("SunDevil Pizza");
        stage.setScene(scene);
        //stage.show();
    }
}
