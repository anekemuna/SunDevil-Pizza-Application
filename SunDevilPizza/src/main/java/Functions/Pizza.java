//by YungLing Liu
/**
 * This class keep track of pizza info
 */
package Functions;
import java.util.ArrayList;

public class Pizza {
    private String type;
    private double price;
    private static ArrayList<String> toppings;

    /**
     * Constructor
     *  default will instantiate everything as null
     *  and toppings list (String) will be instantiated
     */
    public Pizza(){
        type = null;
        price = 0;
        toppings = new ArrayList<String>();
    }

    /**
     * setter function for type
     * type options are: "Veggie Delight", "Pepperoni Pizza", "Cheese Pizza"
     * @param orderType
     */
    public void setType(String orderType){
        type = orderType;
    }

    /**
     * setter function for price
     * @param inputPrice
     */
    public void setPrice(double inputPrice){
        price = inputPrice;
    }

    /**
     * getter function for type
     * @return
     */
    public String getType(){
        return type;
    }

    /**
     * getter function for price
     * @return
     */
    public double getPrice(){
        return price;
    }

    /**
     * to add topping to the topping list
     * Topping options are: "Mushroom", "Onion", "Olives", "Extra cheese"
     * @param inputTopping
     */
    public void addToppings(String inputTopping){
        toppings.add(inputTopping);
    }

    /**
     * print out the details of the pizza
     * output format
     * Pizza type: type
     * Pizza price: price
     * Pizza toppings:
     * topping1
     * topping2
     * ...
     */
    public void printPizza(){
        System.out.println("Pizza type: " + type);
        System.out.println("Pizza price: " + price);
        System.out.println("Pizza toppings: ");
        for(int i = 0; i < toppings.size(); i++){
            System.out.println(toppings.get(i));
        }
    }

}
