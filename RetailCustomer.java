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

}
