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
