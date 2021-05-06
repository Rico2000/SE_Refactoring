
import java.lang.*;
import java.util.*;

class Customer {
    private String name;
    private Vector rentals = new Vector();
    public Customer (String newname){
        name = newname;
    };
    public void addRental(Rental arg) {
        rentals.addElement(arg);
    };
    public String getName (){
        return name;
    };
    public String statement() {
        Enumeration enum_rentals = rentals.elements();	    
        StringBuilder result = new StringBuilder();
        result.append("Rental Record for " + this.getName() + "\n");
        result.append("\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n");

        while (enum_rentals.hasMoreElements()) { 
            Rental each = (Rental) enum_rentals.nextElement();
            result
            		.append("\t")
            		.append(each.getMovie().getTitle())
            		.append("\t\t")
            		.append(each.getDaysRented())
            		.append("\t")
            		.append(String.valueOf(each.getAmount()))
            		.append("\n");
            				
        }
       
        result
        		.append("Amount owed is ")
        		.append(String.valueOf(getTotalAmount()))
        		.append("\n");
        
        result	
        		.append("You earned ")
        		.append(String.valueOf(getFrequentRenterPoints()))
        		.append(" frequent renter points");
        
        return result.toString();
    }
    private double getTotalAmount() {
    	double totalAmount  = 0;
    	Enumeration enum_rentals = rentals.elements();	
    	while(enum_rentals.hasMoreElements()) {
    		Rental each = (Rental) enum_rentals.nextElement();
    		totalAmount +=each.getAmount();
    	}
    	return totalAmount;
    		
    }
    private int getFrequentRenterPoints() {
    	int totalFrequentRenterPoints  = 0;
    	Enumeration enum_rentals = rentals.elements();	
    	while(enum_rentals.hasMoreElements()) {
    		Rental each = (Rental) enum_rentals.nextElement();
    		totalFrequentRenterPoints +=each.getFrequentRenterPoints();
    	}
    	return totalFrequentRenterPoints;
    }

   
}
    