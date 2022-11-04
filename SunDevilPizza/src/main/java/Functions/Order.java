//by YungLing Liu
package Functions;
import Functions.Pizza;

public class Order {
    private String name;
    private Pizza pizza;
    private String status;

    /**
     * Constructor
     * default will instantiate everything as null
     */
    public Order(){
        name = null;
        pizza = null;
        status = null;
    }

    /**
     * setter function for Name
     */
    public void setName(String inputName){
        name = inputName;
    }

    /**
     * setter function for pizza
     * @param inputPizza
     */
    public void setPizza(Pizza inputPizza){
        pizza = inputPizza;
    }

    /**
     * setter function for status
     * status options are: "Accepted", "Ready to Cook", "Cooking", "Ready for pickup"
     * @param inputStatus
     */
    public void setStatus(String inputStatus){
        status = inputStatus;
    }

    /**
     * getter function for name
     * @return
     */
    public String getName(){
        return name;
    }

    /**
     * getter function for status
     * @return
     */
    public String getStatus(){
        return status;
    }

    /**
     * getter function for pizza
     * @return
     */
    public Pizza getPizza(){
        return pizza;
    }

    /**
     * print out the details of the order
     * output format
     * Order name: name
     * Order status: status
     * Pizza type: type
     * Pizza price: price
     * Pizza toppings:
     * topping1
     * topping2
     * ...
     */
    public void printOrder(){
        System.out.println("Order name: " + name);
        System.out.println("Order status: " + status);
        pizza.printPizza();
    }
}
