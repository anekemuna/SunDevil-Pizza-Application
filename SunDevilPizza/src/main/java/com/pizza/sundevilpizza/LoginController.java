package com.pizza.sundevilpizza;

import Functions.Order;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class LoginController {
    private Stage stage;

    private Scene scene;
    @FXML
    private TextField asurite;
    @FXML
    private PasswordField password;
    @FXML
    private Label error;

    private String strPassword;
    private String strAsurite;
    private Order newOrder;

    public void switchToStartup(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SunDevilPizzaApplication.class.getResource("initial_customer_page.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load(), 900, 600);
        //stage.setTitle("SunDevil Pizza");
        stage.setScene(scene);
        //stage.show();
    }

    public void handleSubmit(ActionEvent event) throws IOException {
        boolean flag = false;
        strAsurite = asurite.getText();
        strPassword = password.getText();
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
            error.setText("");
        }
        else
        {
            error.setText("Incorrect AsuriteID and password!");
        }



    }
}
