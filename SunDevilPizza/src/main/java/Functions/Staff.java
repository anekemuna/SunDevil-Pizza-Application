//by YungLing Liu
/**
 * This is the child class of SundevilPizza and the parent class of ProcessingAgent and Chef
 * This class contains a list of orders called "listForChef", which is the list for the chef.
 * This list is accessible for the child classes (ProcessingAgent and Chef)
 * (Order should only be in this list once it's sent to the chef by the processing agent) <- This function is implemented in ProcessingAgent
 * This class also contains functions that will be useful for both ProcessingAgent and Chef (i.e. changeStatus)
 */
package Functions;
import Functions.OrderList;

import java.net.URL;
import java.util.ResourceBundle;

public abstract class Staff extends SundevilPizza {
    protected static OrderList listForChef = new OrderList();             //This list should only contain Orders with the status of "Cooking"

    /**
     * This function let staff (both Processing Agent and Chef) change the status of the order
     * parae
     *
     * @param name
     * @param status
     */
    public void changeStatus(String name, String status) {
        int index = listForChef.findOrder(name);
        listForChef.getOrder(index).setStatus(status);
    }
}