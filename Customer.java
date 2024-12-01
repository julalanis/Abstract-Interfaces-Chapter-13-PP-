package mypackage;
public abstract class Customer implements Comparable<Customer>{
    //named variables
    private String name;
    private int age;

    //constructor with no parameters
    Customer(){
        this.name = "Unknown";

    }

    //constructor with parameters
    Customer(String name, int age){
        this.name = name;
        this.age = age;
    }


    //get methods for 2 variables
    String getName(){
        return (name != null) ? name : "Unknown";
    }

    int getAge(){
        return age;
    }

    //set methods for 2 variables
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    //importanceLevel method is now abstract
    public abstract String importanceLevel();
    
    
    //compareTo methods for Name and Age of customer
    public int compareName(Customer customerName) {
    	if ((this.name).equals(customerName.getName())) {
    		return 0;
    	}
    	else return 1;
    }
    	
    public int compareAge(Customer customerAge) {
    		if(this.age > (customerAge.getAge())) {
    			return 1;
    		} else if (this.age < (customerAge.getAge())) {
    			return -1;
    		} else return 0;
    		
    	}

    //toString method
    public String toString(){
        return "Customer name: " + name + "\n" +
                "Customer age: " + age + "\n" +
                "Customer importance level: " + importanceLevel();
    }

}
