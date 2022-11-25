//by YungLing Liu
package com.pizza.sundevilpizza;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.*;

import Functions.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ChefPageController extends Staff {

    private Stage stage;
    private Scene scene;
    @FXML
    private ListView listView;

    /**
     * when the page is initialized, load orders in listForChef to the screen
     */
    @FXML
    public void initialize() {
        loadOrder();
        System.out.println("Orders in list when Chef Page is initialized: ");
        list.printOrderList();
    }

   //Back button: on click, go back to welcome page
    public void toWelcomePage(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SunDevilPizzaApplication.class.getResource("startup_page.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load(), 900, 600);
        stage.setTitle("SunDevil Pizza");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * This class make the individual order pane
     * @param inputName
     * @param inputPizzaType
     * @param inputToppings
     * @return
     */
    public Pane orderPane(String inputName, String inputPizzaType, String inputToppings){
        VBox orderPane = new VBox();
        orderPane.setBackground(new Background(
                new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        orderPane.setPrefSize(750.0, 117.0);

        Label name = new Label(inputName);
        name.setPrefSize(95.0, 24.0);
        name.setFont(new Font("Comic Sans MS", 18));

        Label type = new Label("Pizza Type: " + inputPizzaType);
        type.setPrefSize(330.0, 33.0);
        type.setFont(new Font("Comic Sans MS", 18));

        Label toppings = new Label("Pizza Toppings: " + inputToppings);
        toppings.setPrefSize(675.0, 33.0);
        toppings.setFont(new Font("Comic Sans MS", 18));

        Button ready = new Button("Ready");
        ready.setPrefSize(132.0, 46.0);
        ready.setStyle("-fx-background-color: #FA8072;  -fx-font-size:20; -fx-font-family: Comic Sans MS; -fx-text-fill: white");

        /**
         * the ready button: when it's clicked, it change the status of the order to "ready for pickup" and remove it from chef's view
         */
        ready.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
               changeStatus(inputName, "Ready for pickup");
               listView.getItems().clear();
               loadOrder();
               System.out.println("Orders in list after Ready is clicked:");
               list.printOrderList();
            }
        });

        HBox subPane = new HBox();
        subPane.setSpacing(570);
        subPane.getChildren().addAll(name, ready);
        VBox subPane2 = new VBox();
        subPane2.getChildren().addAll(type, toppings);
        orderPane.getChildren().add(subPane);
        orderPane.getChildren().add(subPane2);

        return orderPane;
    }

    /**
     * load the orders in list to the chef's view
     */
    public void loadOrder(){

        for(int i = 0; i < list.getSize(); i++){
            Order current = new Order();
            current = list.getOrder(i);
            if (current.getStatus().equals("Cooking")) {
                String orderName = current.getName();
                String pizzaType = current.getPizza().getType();
                String pizzaToppings = current.getPizza().getToppings();
                Pane pane = new Pane();
                pane = orderPane(orderName, pizzaType, pizzaToppings);
                listView.getItems().add(pane);
            }
        }


    }

}
