//by YungLing Liu
package Functions;
import java.util.ArrayList;
import Functions.Order;
import Functions.Pizza;

public class OrderList {
    private static ArrayList<Order> orderList;

    /**
     * Constructor to instantiate orderList
     */
    public OrderList(){
        orderList = new ArrayList<Order>();
    }

    /**
     * to add a new order to the orderList
     * @param newOrder
     */
    public void addOrder(Order newOrder){
        orderList.add(newOrder);
    }

    /**
     * find the order by name
     * it will return the index of the order
     * if order not found, it will return -1
     * @param inputName
     * @return
     */
    public int findOrder(String inputName){
        for(int i = 0; i < orderList.size(); i++){
            String current = orderList.get(i).getName();
            if (current.equals(inputName)){
                return i;
            }
        }
        System.out.println("Order not found");
        return -1;
    }

    /**
     * delete an order from orderList by name
     * @param inputName
     */
    public void deleteOrder(String inputName){
        int index = findOrder(inputName);
        if (index != -1){
            orderList.remove(index);
        }
    }

    /**
     * delete an order from orderList by index
     * @param index
     */
    public void deleteOrder(int index){
        orderList.remove(index);
    }

    /**
     * Access the order at an index
     * @param index
     * @return
     */
    public Order getOrder(int index){
        return orderList.get(index);
    }

    /**
     * get the size of the orderList
     * @return
     */
    public int getSize(){
        return orderList.size();
    }

    /**
     * print the whole orderList
     */
    public void printOrderList(){
        for(int i = 0; i < orderList.size(); i++){
            orderList.get(i).printOrder();
            System.out.println(" ");
        }
    }
}
