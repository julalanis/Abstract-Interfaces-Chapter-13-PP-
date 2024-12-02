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
    
    
    //compareTo method for name and age
    public int compareTo(Customer customerName) {
    	int comparison = this.name.compareTo(customerName.getName());
        if (comparison != 0){
        	return comparison;
        } 
        	comparison = Integer.compare(this.age, customerName.getAge());
        	return comparison;

    }

    //toString method
    public String toString(){
        return "Customer name: " + name + "\n" +
                "Customer age: " + age + "\n" +
                "Customer importance level: " + importanceLevel();
        		
    }

}
