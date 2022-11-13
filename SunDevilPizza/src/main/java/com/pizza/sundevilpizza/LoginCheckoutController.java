package com.pizza.sundevilpizza;

import Functions.Pizza;
import Functions.ProcessingAgent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class LoginCheckoutController {
    private Stage stage;

    private Scene scene;
    private Pizza newPizza;
    @FXML
    private TextField asurite_field;
    @FXML
    private PasswordField password_field;

    private String strPassword;
    private String strAsurite;


    public void backToCheckout(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SunDevilPizzaApplication.class.getResource("checkout_page.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load(), 900, 600);

        // pass pizza object to next scene
        CheckoutController control = fxmlLoader.getController();
        control.setCheckoutPizza(newPizza); // set pizza for checkout page

        //stage.setTitle("SunDevil Pizza");
        stage.setScene(scene);
        //stage.show();
    }

    public void handleSubmit(ActionEvent event) throws IOException {
        FileReader in = new FileReader("data/StudentPasswords.txt");
        BufferedReader br = new BufferedReader(in);
        String line;
        while ((line = br.readLine()) != null) {
            if(line.contains(" "))
                System.out.println(line);
        }
        in.close();



    }

    public void setPizza(Pizza pizza){
        newPizza = pizza;
    }

}
