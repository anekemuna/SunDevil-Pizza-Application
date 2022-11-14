//by YungLing Liu and Romeo Barrientos
/**
 * This class is the child class of Staff
 * It implements functions specific to ProcessingAgent
 */
package Functions;

public class ProcessingAgent extends Staff{



    /**
     * This class send order to Chef by adding it to listForChef
     * @param order
     */
    public void sendToChef(Order order){
        listForChef.addOrder(order);
    }
}
