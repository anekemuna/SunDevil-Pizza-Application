package Functions;

import java.util.ArrayList;

public class CustomerList {
    private ArrayList<Customer> customerList;

    public CustomerList(){

        customerList = new ArrayList<Customer>();
    }
    public void addCustomer(Customer newCustomer){

        customerList.add(newCustomer);
    }
    public Customer getCustomer(int index){

        return customerList.get(index);
    }
    public int findCustomer(String inputName){
        for(int i = 0; i < customerList.size(); i++){
            String current = customerList.get(i).getName();
            if (current.equals(inputName)){
                return i;
            }
        }
        System.out.println("Customer not found");
        return -1;
    }
}
