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

import java.io.*;

public abstract class Staff extends SundevilPizza {
    /**
     * This function let staff (both Processing Agent and Chef) change the status of the order
     * parae
     *
     * @param name
     * @param status
     */
    protected void changeStatus(String name, String status) {
        int index = list.findOrder(name);
        list.getOrder(index).setStatus(status);

        // rewrites the list
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/data/OrderListData.txt")))
        {
            bw.write(list.getSize()+ "");
            bw.newLine();

            for(int i = 0; i < list.getSize(); i++)
            {
                Order item = list.getOrder(i);
                bw.write(item.getName() + "\n");
                bw.write(item.getStatus() + "\n");
                bw.write(item.getPizza().getType() + "\n");
                bw.write(item.getPizza().returnToppingList().size() + " ");
                bw.write(item.getPizza().getToppings() + "\n");
                bw.write(item.getPizza().getPrice() + "\n");
                bw.newLine();
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
    }
}