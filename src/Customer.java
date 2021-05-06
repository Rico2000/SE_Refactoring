
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
        String result = "Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        while (enum_rentals.hasMoreElements()) { 
            Rental each = (Rental) enum_rentals.nextElement();
            result += "\t" + each.getMovie().getTitle()+ "\t" + "\t" + each.getDaysRented() + "\t" + String.valueOf(each.getAmount()) + "\n";
        }
       
        result += "Amount owed is " + String.valueOf(getTotalAmount()) + "\n";
        result += "You earned " + String.valueOf(getFrequentRenterPoints()) + " frequent renter points";
        return result;
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
    