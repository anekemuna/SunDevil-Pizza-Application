package com.pizza.sundevilpizza;

import Functions.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoginCheckoutController extends Customer{
    private Stage stage;

    private Scene scene;
    private Pizza newPizza;
    @FXML
    private TextField asurite_field;
    @FXML
    private PasswordField password_field;
    @FXML
    private Label error_label;

    private String strPassword;
    private String strAsurite;
    private Order newOrder;


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
        boolean flag = false;
        strAsurite = asurite_field.getText();
        strPassword = password_field.getText();
        // read password file
        FileReader in = new FileReader("src/main/java/data/StudentPasswords.txt");
        BufferedReader br = new BufferedReader(in);
        String line;

        while ((line = br.readLine()) != null) {
            String[] lineSplit = line.split(" ");
            if(lineSplit[0].equals(strAsurite))
            {
                if(lineSplit[1].equals(strPassword))
                {
                    flag = true;
                }
            }
        }
        in.close();

        if(flag)
        {
            error_label.setText("");

            //create order
            newOrder = new Order();
            newOrder.setName(strAsurite);
            newOrder.setPizza(newPizza);
            newOrder.setStatus("Ready to Cook");

            list.addOrder(newOrder);

            FXMLLoader fxmlLoader = new FXMLLoader(SunDevilPizzaApplication.class.getResource("order_status_page.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(fxmlLoader.load(), 900, 600);

            // pass user name
            OrderStatusController control = fxmlLoader.getController();
            control.setCustomerName(strAsurite);

            stage.setTitle("SunDevil Pizza");
            stage.setScene(scene);
            stage.show();
        }
        else
        {
            asurite_field.clear();
            password_field.clear();
            error_label.setText("Incorrect AsuriteID and password!");
        }



    }

    public void setNewPizza(Pizza pizza){
        newPizza = pizza;
    }

}
