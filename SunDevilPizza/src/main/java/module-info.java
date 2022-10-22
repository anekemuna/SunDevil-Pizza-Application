module com.pizza.sundevilpizza {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.pizza.sundevilpizza to javafx.fxml;
    exports com.pizza.sundevilpizza;
}