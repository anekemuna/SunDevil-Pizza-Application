//by YungLing Liu
package Functions;
import Functions.Order;
import Functions.OrderList;
import Functions.Pizza;

public class SundevilPizza {
    protected OrderList list = new OrderList();


    /**
     * when an order is completed, finishOrder will remove the order from the list
     * @param name
     */
    public void finishOrder(String name){
        list.deleteOrder(name);
    }
}
