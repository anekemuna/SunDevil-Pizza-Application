package com.pizza.sundevilpizza;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
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

    public void chefReady(ActionEvent event) throws IOException {
        changeStatus(inputName, "Ready to Cook");
        sendToChef(Order order);
    }
}
