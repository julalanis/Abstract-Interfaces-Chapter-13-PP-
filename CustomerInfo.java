/** Student Name: Julie Alanis
 * Date Completed: 11/30/2024
 * Project No.& Page No.: Chapter 13 PP Julie Alanis
 * Extra Credit: No
 * Project Description: This project crates an ArrayList of Flight and Retail Customer objects and utilizes the compareTo methods that have been added in Customer,
 * 						RetailCustomer and FlightCustomer super and subclasses respectively. compareTo in Customer compares two objects name and ages, whilst RetailCustomer's
 * 						compareTo method compares two objects' TotalSpent amount, and FlightCustomer's compareTo compares two objects' TicketPrice amount.
 **/
package mypackage;
import java.lang.Math;
import java.util.ArrayList;

public class CustomerInfo {
    public static void main(String[] args) {

        System.out.println("Create an Array List of Customer type. \nCreate six Customers by declaring and instantiating \nthree Flight Customers and three Retail Customer objects each." +
        "\nAdd the six Customer objects to the Customer array list.\n");

        System.out.println("******************************************" + "\n");

        System.out.println("Print out the Customer Information in the array list as well as the importance level information" +
        "\nby calling the importanceLevel method on the array list. This is done in a loop.\n");

        //declare an ArrayList of 6 Customers: 3 Flight and 3 Retail.
        ArrayList<Customer> customerList = new ArrayList<>();
        FlightCustomer flightCustomer1 = new FlightCustomer("Tato", 7, ((int)(Math.random() * 200)), 388.66);
        FlightCustomer flightCustomer2 = new FlightCustomer("Tato", 7, ((int)(Math.random() * 200)), 388.66);
        FlightCustomer flightCustomer3 = new FlightCustomer("Riley", 7, ((int)(Math.random() * 200)), 708.66);
        RetailCustomer retailCustomer1 = new RetailCustomer("Julie", 30, 154.65, 2);
        RetailCustomer retailCustomer2 = new RetailCustomer("Julie", 30, 120.00, 2);
        RetailCustomer retailCustomer3 = new RetailCustomer("Leslie", 27, 650.50, 4);

        //add all objects to ArrayList
        customerList.add(flightCustomer1);
        customerList.add(flightCustomer2);
        customerList.add(flightCustomer3);
        customerList.add(retailCustomer1);
        customerList.add(retailCustomer2);
        customerList.add(retailCustomer3);
        
        for (int i = 0; i < customerList.size(); i++) {
        	System.out.println(customerList.get(i));
        	System.out.println();
        }
        
        System.out.println("******************************************" + "\n");

        System.out.println("All of the following output is done in an if-else statement\n" +
        "because comparisons are made by calling the compareTo method. This is to compare the array list elements\n" +
        "using the get method with each element's index. Now, compare the two Retail Customers named Julie, both are 30 years old\n" +
        "but with different total-spent amounts. Here is the result:\n");
        
        if ( (retailCustomer1.compareTo(retailCustomer2) > 0)) {
        	System.out.println("The first Julie spent more.\n");
        } else if ( (retailCustomer1.compareTo(retailCustomer2) < 0)){
        	System.out.println("The second Julie spent more.\n");
        } else System.out.println("They are the same.\n");
      
        System.out.println("******************************************" + "\n");
        
        System.out.println("Now compare the two Flight Customers Tato. They have the same name, age and ticket price.\n" +
        "They should be the same when compared. Here is the result: \n");
        
        if ( (flightCustomer1.compareTo(flightCustomer2) > 0)) {
        	
        	System.out.println("The first Tato's ticket costs more.\n");
        } else if ( (flightCustomer1.compareTo(flightCustomer2) < 0)){
        	System.out.println("The second Tato's ticket costs more.\n");
        } else System.out.println("They are the same.\n");
        
        System.out.println("******************************************" + "\n");
        
        System.out.println("Now compare the first Julie and Leslie. Since everything is different, they are compared based on names.\n" +
        "Julie should come first. Here is the result: \n");
        
        if (retailCustomer1.compareTo(retailCustomer3) < 0) {
            System.out.println(retailCustomer1.getName() + " is in front of " + retailCustomer3.getName() + "\n");
        } else if (retailCustomer1.compareTo(retailCustomer3) > 0) {
            System.out.println(retailCustomer3.getName() + " is in front of " + retailCustomer1.getName() + "\n");
        } else {
            System.out.println("They are the same.\n");
        }
        
        System.out.println("******************************************" + "\n");
        
        System.out.println("Now create a new Retail Customer named Leslie, only with a different age: 35. Print out the new Retail Customer you just created.\n");
        RetailCustomer retailCustomer4 = new RetailCustomer("Leslie", 35, 650.50, 4);
        customerList.add(retailCustomer4);
        
        System.out.println(retailCustomer4.toString());
        System.out.println();
        
        System.out.println("******************************************" + "\n");
        
        System.out.println("Now compare the new Leslie with the old Leslie in the array list. The old one should come first.\n" +
        "Print out the age to show this. Here is the result: \n");
        
        if ( (retailCustomer3.compareTo(retailCustomer4) > 0)) {
        	System.out.println("Leslie at age " + retailCustomer4.getAge() + " comes first.\n");
        } else if ( (retailCustomer3.compareTo(retailCustomer4) < 0)) {
        	System.out.println("Leslie at age " + retailCustomer3.getAge() + " comes first.\n");
        } else System.out.println("They are the same.");
        
        System.out.println("******************************************" + "\n");
        
        System.out.println("compareTo method demonstration ended... Thank you!");

    }
}
