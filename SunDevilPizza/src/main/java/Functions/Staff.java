//by YungLing Liu
/**
 * This is the child class of SunDevilPizza and the parent class of ProcessingAgent and Chef
 * This list is accessible for the child classes (ProcessingAgent and Chef)
 * This class also contains functions that will be useful for both ProcessingAgent and Chef (i.e. changeStatus)
 */
package Functions;
import java.io.*;

public abstract class Staff extends SundevilPizza {
    /**
     * This function let staff (both Processing Agent and Chef) change the status of the order and re-writes the list to text file
     *
     * @param name AsuriteID associated with order
     * @param status the value to update the status too
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
        catch (Exception e)
        {
            System.out.println("Exception: " + e);
        }
    }
}