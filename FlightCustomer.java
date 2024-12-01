package mypackage;
public class FlightCustomer extends Customer {
    //named variables
    private int seatNumber;
    private double ticketPrice;

    //constructor with no parameters
    FlightCustomer(){
    }

    //constructor with parameters
    FlightCustomer(String name, int age, int seatNumber, double ticketPrice){
        setName(name);
        setAge(age);
        this.seatNumber = seatNumber;
        this.ticketPrice = ticketPrice;
    }

    //get methods for 2 variables
    int getSeatNumber(){
        return seatNumber;
    }

    double getTicketPrice(){
        return ticketPrice;
    }

    //set methods for 2 variables
    public void setSeatNumber(int seatNumber){
        this.seatNumber = seatNumber;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
        
        // Assign seat number based on ticket price directly here
        //EXTRA CREDIT: Seat assignments depending on ranking moved from importanceLevel to setTicketPrice)
        if (ticketPrice >= 1000.00) {
            this.seatNumber = (int) (Math.random() * 50);
        } else if (ticketPrice >= 500.00) {
            this.seatNumber = (int) (Math.random() * 50) + 50;
        } else if (ticketPrice >= 250.00) {
            this.seatNumber = (int) (Math.random() * 50) + 100;
        } else {
            this.seatNumber = (int) (Math.random() * 50) + 150;
        }
    }

    //importanceLevel method to override Customer
    //no values given for ticketPrice and rankings, 1000+ Gold, 500-999 Silver, 250-499 Bronze, 0-250 Regular
    @Override
    public String importanceLevel() {
        if (ticketPrice >= 1000.00) {
            return "Gold";
        } else if (ticketPrice >= 500.00) {
            return "Silver";
        } else if (ticketPrice >= 250.00) {
            return "Bronze";
        } else {
            return "Regular";
        }
    }

    //toString method
    public String toString(){
        return  "Flight Customer: " + "\n" +
                super.toString() +
                "\nCustomer seat number: " + seatNumber + "\n" +
                "Customer ticket price: " + ticketPrice;
    }
    
    @Override
    public int compareTo(Customer customer) {
        // Print the names before comparison
       /* System.out.println("Comparing names: '" + this.getName() + "' vs '" + customer.getName() + "'"); */

        int nameComparison = super.compareName(customer);
        /*if (nameComparison == 0) {
            // If the names are the same, return 0 (no comparison needed)
            System.out.println("Names are the same, no need to compare ticket prices.");
            return 0;
        }*/

        /*System.out.println("Names are different, comparing ticket prices...");*/

        // Proceed with ticket price comparison
        if (customer instanceof FlightCustomer) {
            FlightCustomer flightCustomer = (FlightCustomer) customer;

            // Print ticket prices for debugging
           /* System.out.println("Comparing ticket prices: " + this.ticketPrice + " vs " + flightCustomer.getTicketPrice());*/

            // Check if ticketPrice is greater
            if (this.ticketPrice > flightCustomer.getTicketPrice()) {
               /* System.out.println("Ticket price is greater");*/
                return 1;  // Current customer has a higher ticket price
            } 
            // Check if ticketPrice is less
            else if (this.ticketPrice < flightCustomer.getTicketPrice()) {
               /* System.out.println("Ticket price is less");*/
                return -1;  // Current customer has a lower ticket price
            } 
            // Check if ticketPrice is equal
            else {
                /*System.out.println("Ticket price is equal");*/
                return 0;  // Ticket prices are equal
            }
        }
       /* System.out.println("These types of customers aren't the same");*/
        return 0;  // If customer isn't a FlightCustomer, return 0
    }

	
}
