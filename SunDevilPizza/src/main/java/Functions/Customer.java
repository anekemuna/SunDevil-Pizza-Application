/**
 * This class need to be implemented by the customer side
 */
package Functions;

public class Customer extends SundevilPizza {

    private String name;
    private String Asurite;
    private Pizza pizzaType;
    public String status;

    /**
     *
     * @param inputName name of customer
     */
    public void setName(String inputName){
        name = inputName;
    }

    /**
     *
     * @return name customer's name
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @param inputPizza type of pizza the customer wants
     */
    public void setPizza(Pizza inputPizza){
        pizzaType = inputPizza;
    }

    /**
     *
     * @return pizzaType 
     */
    public Pizza getPizza(){
        return pizzaType;
    }
    public void setStatus(String inputStatus){
        status = inputStatus;
    }
    public String getStatus(){
        return status;
    }

    public void choosePizza(Pizza type){
        pizzaType = type;
    }

    public String getAsurite(){
        return Asurite;
    }

    public void setAsurite(String asurite) {
        Asurite = asurite;
    }
}
