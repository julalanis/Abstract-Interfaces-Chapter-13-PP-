package mypackage;
public class RetailCustomer extends Customer {
    //named variables
    private double totalSpent;
    private int numberOfItemsPurchased;

    //constructor with no parameters
    RetailCustomer(){
    }

    //constructor with parameters
    RetailCustomer(String name, int age, double totalSpent, int numberOfItemsPurchased){
        setName(name);
        setAge(age);
        this.totalSpent = totalSpent;
        this.numberOfItemsPurchased = numberOfItemsPurchased;
    }

    //get methods for 2 variables
    double getTotalSpent(){
        return totalSpent;
    }

    int getNumberOfItemsPurchased(){
        return numberOfItemsPurchased;
    }

    //set methods for 2 variables
    public void setTotalSpent(double totalSpent){
        this.totalSpent = totalSpent;
    }

    public void setNumberOfItemsPurchased(int numberOfItemsPurchased){
        this.numberOfItemsPurchased = numberOfItemsPurchased;
    }

    //importanceLevel method to override Customer
    //values were not given so if average = $200+ Gold, $150-199 Silver, $100-149 Bronze, $0-99 Regular
    @Override
    public String importanceLevel() {
        double average = totalSpent / numberOfItemsPurchased;
        if (average >= 200) {
            return "Gold";
        } else if (average >= 150) {
            return "Silver";
        } else if (average >= 100) {
            return "Bronze";
        } else return "Regular";
    }

        //toString method
        public String toString(){
        return  "Retail Customer: " + "\n" +
                super.toString() +
                "\nNumber of Items Purchased: " + getNumberOfItemsPurchased() + "\n" +
                "Total Spent: " + getTotalSpent();
        }

        @Override
        public int compareTo(Customer customer) {
            // Print the names before comparison
           /* System.out.println("Comparing names: '" + this.getName() + "' vs '" + customer.getName() + "'");*/

            int nameComparison = super.compareName(customer);
            /*if (nameComparison == 0) {
                // If the names are the same, return 0 (no comparison needed)
                System.out.println("Names are the same, no need to compare total spent .");
                return 0;
            }*/

           /* System.out.println("Names are different, comparing total spent ...");*/

            // Proceed with ticket price comparison
            if (customer instanceof RetailCustomer) {
            	RetailCustomer retailCustomer = (RetailCustomer) customer;

                // Print ticket prices for debugging
               /* System.out.println("Comparing total spent: " + this.totalSpent + " vs " + retailCustomer.getTotalSpent());*/

                // Check if ticketPrice is greater
                if (this.totalSpent > retailCustomer.getTotalSpent()) {
                    /*System.out.println("Total spent is greater");*/
                    return 1;  // Current customer has a higher ticket price
                } 
                // Check if ticketPrice is less
                else if (this.totalSpent < retailCustomer.getTotalSpent()) {
                   /* System.out.println("Total spent is less");*/
                    return -1;  // Current customer has a lower ticket price
                } 
                // Check if ticketPrice is equal
                else {
                    /*System.out.println("Total spent is equal");*/
                    return 0;  // Ticket prices are equal
                }
            }
            System.out.println("These types of customers aren't the same");
            return 0;  // If customer isn't a FlightCustomer, return 0
        }

}
