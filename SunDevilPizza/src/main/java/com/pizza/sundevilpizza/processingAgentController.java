package com.pizza.sundevilpizza;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.*;
import Functions.*;
import java.io.IOException;
public class processingAgentController extends Staff {
    private Stage stage;

    private Scene scene;


    @FXML
    private Button back;

    @FXML
    private ListView processList;

    @FXML
    public void initialize() {
        customerOrder();
        System.out.println("Orders in list when Processing Agent Page is initialized");
        list.printOrderList();
    }


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

        Button cook = new Button("cook");
        cook.setPrefSize(132.0, 46.0);
        cook.setStyle("-fx-background-color: #FA8072;  -fx-font-size:20; -fx-font-family: Comic Sans MS; -fx-text-fill: white");

        /**
         * the ready button: when it's clicked, it change the status of the order to "ready for pickup" and remove it from chef's view
         */
        cook.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                changeStatus(inputName, "Cooking");
                processList.getItems().clear();
                customerOrder();
                System.out.println("Orders in list after COOK is clicked");
                list.printOrderList();
            }
        });

        HBox subPane = new HBox();
        subPane.setSpacing(570);
        subPane.getChildren().addAll(name, cook);
        VBox subPane2 = new VBox();
        subPane2.getChildren().addAll(type, toppings);
        orderPane.getChildren().add(subPane);
        orderPane.getChildren().add(subPane2);

        return orderPane;
    }


    public void toWelcomePage(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SunDevilPizzaApplication.class.getResource("passwordCheck.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load(), 900, 600);
        stage.setTitle("SunDevil Pizza");
        stage.setScene(scene);
        stage.show();
    }

   public void customerOrder(){

        for(int i = 0; i < list.getSize(); i++) {
        Order current = new Order();
        current = list.getOrder(i);
        if (current.getStatus().equals("Ready to Cook")){
            String orderName = current.getName();
            String pizzaType = current.getPizza().getType();
            String pizzaToppings = current.getPizza().getToppings();
            Pane pane = new Pane();
            pane = orderPane(orderName, pizzaType, pizzaToppings);
            processList.getItems().add(pane);
        }
    }
    }
}
