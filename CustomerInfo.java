/** Student Name: Julie Alanis
 * Date Completed: 10/25/2024
 * Project No.& Page No.: Chapter 13 PP Julie Alanis
 * Extra Credit: No
 * Project Description: 
 **/
package mypackage;
import java.lang.Math;
import java.util.ArrayList;

public class CustomerInfo {
    public static void main(String[] args) {

        System.out.println("Created an ArrayList of six Customers by declaring and instantiating two Flight Customers, " + "\n" +
                        "two Retail Customers and two Customer objects. Add the three different types of Customer objects " + "\n" +
                        "to the Customer array." + "\n");

        System.out.println("******************************************" + "\n");

        System.out.println("In a for loop, print out the Customer list by printing out each element of the ArrayList " + "\n" +
                           "and calling the importanceLevel method on each element." + "\n");

        //declare an ArrayList of Customers: 2 Customers, 2 Flight Customers, 2 Retail Customers
        ArrayList<Customer> customerList = new ArrayList<>();
        Customer customer1 = new Customer();
        Customer customer2 = new Customer("Julie", 30);
        FlightCustomer flightCustomer1 = new FlightCustomer();
        FlightCustomer flightCustomer2 = new FlightCustomer("Tato", 7, ((int)(Math.random() * 200)), 388.66);
        RetailCustomer retailCustomer1 = new RetailCustomer();
        RetailCustomer retailCustomer2 = new RetailCustomer("Riley", 6, 454.65, 2);

        //add all objects to ArrayList
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(flightCustomer1);
        customerList.add(flightCustomer2);
        customerList.add(retailCustomer1);
        customerList.add(retailCustomer2);

        //loop to print out each Customer object
        for (int i = 0; i < customerList.size(); i++){
            System.out.println(customerList.get(i));
            System.out.println();
        }

        System.out.println("In a for loop, change all Customer names to Customer plus a number by calling " + "\n" +
                            "the setName method of the Customer class. Then display only the names by calling " + "\n" +
                            "the getName method on each ArrayList element." + "\n");

        //loop to set all Customer names to Customer# and print them
        for (int j = 0; j < customerList.size(); j++){
           customerList.get(j).setName("Customer" + (j + 1));
           System.out.println(customerList.get(j).getName() + "\n");
        }

        System.out.println("Making changes: " + "\n" +
                "If the customer is a FlightCustomer, change the ticket price to 2000. If they are a Retail Customer, " + "\n" +
                "change the amount of total spent to 500 by using the instanceof operator to test what type of Customer " + "\n" +
                "each array element is. This is done in a for loop. " + "\n");

        for (int k = 0; k < customerList.size(); k++){
            if (customerList.get(k) instanceof FlightCustomer){
                ((FlightCustomer)customerList.get(k)).setTicketPrice(2000.00);
            } else if (customerList.get(k) instanceof RetailCustomer){
                ((RetailCustomer)customerList.get(k)).setTotalSpent(500.00);
            }
        }

        System.out.println("That was done. Now call the getName method to display each Customer's name and call the " + "\n" +
                "getTotalSpent method for Retail Customers and getTicketPrice for Flight Customers. " + "\n" +
                "This is done in a for loop. ");

        for (int l = 0; l < customerList.size(); l++){
            if (customerList.get(l) instanceof RetailCustomer) {
                System.out.println(customerList.get(l).getName());
               System.out.println(((RetailCustomer) customerList.get(l)).getTotalSpent());
            } else if (customerList.get(l) instanceof FlightCustomer){
                System.out.println(customerList.get(l).getName());
                System.out.println(((FlightCustomer) customerList.get(l)).getTicketPrice());
            }
            System.out.println();
        }

        System.out.println("Finally, display each customer's information by calling the toString method and the importanceLevel" + "\n" +
                            "method for all the Customer elements. This is done in a for loop." + "\n");

        for (int m = 0; m < customerList.size(); m++){
            if (customerList.get(m) instanceof RetailCustomer) {
                System.out.println(customerList.get(m).toString() + "\n");
            } else if (customerList.get(m) instanceof FlightCustomer) {
                System.out.println(customerList.get(m).toString() + "\n");
            } else System.out.println(customerList.get(m).toString() + "\n");

        }

        System.out.println("Extra credit 1: Based on the importanceLevel of Customer, 200 seats should be divided into four categories: " + "\n" +
                           "Seats 1-50 Gold ($1000+), 51-100 Silver ($500+), 101-150 Bronze ($250), 151-200 Regular (Anything below $250)." + "\n" +
                           "Now assigning appropriate values to display this assignment using flightCustomer3 object." + "\n");

        flightCustomer1.setTicketPrice(1000);
        System.out.println(flightCustomer1 + "\n");

        flightCustomer1.setTicketPrice(550.99);
        System.out.println(flightCustomer1 + "\n");

        flightCustomer1.setTicketPrice(255.99);
        System.out.println(flightCustomer1 + "\n");

        flightCustomer1.setTicketPrice(100.99);
        System.out.println(flightCustomer1 + "\n");

        System.out.println("That is enough Customer information for today!" + "\n" +
                            "Fun fact, did you know Tato and Riley are my cats' names?");

    }
}
