/**
 * This class need to be implemented by the customer side
 */
package Functions;

public class Customer extends SundevilPizza {
    private String name;
    private String ASUID;
    private Pizza pizzaType;
    private String[] toppings;
    private Order order;
    public String status;

    public void choosePizza(String type){
        this.type = type;
    }
    public void chooseToppings(){

    }
    public void setName(String inputName){
        name = inputName;
    }
    public String getName(){
        return name;
    }
    public void setPizza(Pizza inputPizza){
        pizzaType = inputPizza;
    }
    public Pizza getPizza(){
        return pizzaType;
    }
    public void setStatus(String inputStatus){
        status = inputStatus;
    }
    public String getStatus(){
        return status;
    }
}
