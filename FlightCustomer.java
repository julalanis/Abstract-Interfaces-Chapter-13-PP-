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
    
    //compareTo method for FlightCustomer that compares by ticketPrice
    @Override
    public int compareTo(Customer customer) {
        // Proceed with ticket price comparison
        if (customer instanceof FlightCustomer) {
            FlightCustomer flightCustomer = (FlightCustomer) customer;

            if (this.ticketPrice > flightCustomer.getTicketPrice()) {
                return 1;  
            } 
            else if (this.ticketPrice < flightCustomer.getTicketPrice()) {
                return -1;  
            } 
            else {
            	return 0;
            }
        }
        return 0;  // If customer isn't a FlightCustomer, return 0
    }

	
}
