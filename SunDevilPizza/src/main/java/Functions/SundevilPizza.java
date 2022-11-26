//by YungLing Liu
/**
 * This class is the parent class of Customer and Staff.
 * It keep track of an master list of Orders called "list" (OrderList)
 * Both Customer and Staff (as the child classes) are able to access the list
 * It contains functions that both Staff and Customer would use (i.e. finishOrder)
 * The rest of specific functions will be implemented in the child classes
 */
package Functions;
import Functions.Order;
import Functions.OrderList;
import Functions.Pizza;

import java.util.ArrayList;

public class SundevilPizza {
    protected static OrderList list = new OrderList();
    /**
     * when an order is completed, finishOrder will remove the order from the list
     * @param name
     */
    public void finishOrder(String name){
        list.deleteOrder(name);
    }


}
