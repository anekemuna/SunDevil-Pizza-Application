package Functions;
import Functions.OrderList;

public class Staff extends SundevilPizza {
    protected static OrderList listForChef = new OrderList();             //This list should only contain Orders with the status of "Cooking"

    /**
     * This function let staff (both Processing Agent and Chef) change the status of the order
     * parae
     * @param name
     * @param status
     */
    public void changeStatus(String name, String status){
        int index = list.findOrder(name);
        list.getOrder(index).setStatus(status);
    }


}
