//by YungLing Liu
/**
 * This class keeps track of an order list. It has functions that manipulate the list and search in the list.
 */
package Functions;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;

public class OrderList {
    private ArrayList<Order> orderList;

    /**
     * Constructor to instantiate orderList
     */
    public OrderList()
    {
        orderList = new ArrayList<Order>();

        try(BufferedReader br = new BufferedReader(new FileReader("src/main/java/data/OrderListData.txt")))
        {
            int orderSize = Integer.parseInt(br.readLine());


            for(int i = 0; i < orderSize; i++)
            {
                Order item = new Order();

                item.setName(br.readLine());
                item.setStatus(br.readLine());

                // set pizza
                Pizza newPizza = new Pizza();
                newPizza.setType(br.readLine());

                String pizzaTopping = br.readLine();
                String [] token = pizzaTopping.split(" ");

                for(int j = 1; j <= Integer.parseInt(token[0]); j++)
                {
                    newPizza.addToppings(token[j]);
                }

                newPizza.setPrice(Double.parseDouble(br.readLine()));

                item.setPizza(newPizza);
                orderList.add(item);

                String empty = br.readLine();
            }


        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("File Not Found: " + fnfe);
        }
        catch (IOException ioe)
        {
            System.out.println("IO Exception: " + ioe);
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("Number Format Exception: " + nfe);
        }
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
