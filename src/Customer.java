
import java.lang.*;
import java.util.*;

class Customer {
    private String name;
    private ArrayList<Rental> rentals = new ArrayList<Rental>();
    public Customer (String newname){
        name = newname;
    };
    public void addRental(Rental rental) {
        rentals.add(rental);
    };
    public String getName (){
        return name;
    };
    public String statement() {
        StringBuilder result = new StringBuilder();
        result.append("Rental Record for " + this.getName() + "\n");
        result.append("\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n");

        for(Rental rental : rentals){
            result
            		.append("\t")
            		.append(rental.getMovie().getTitle())
            		.append("\t\t")
            		.append(rental.getDaysRented())
            		.append("\t")
            		.append(String.valueOf(rental.getAmount()))
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
    	for(Rental rental: rentals) {
    		totalAmount +=rental.getAmount();
    	}
    	return totalAmount;
    		
    }
    private int getFrequentRenterPoints() {
    	int totalFrequentRenterPoints  = 0;
    	for(Rental rental: rentals) {
    		totalFrequentRenterPoints +=rental.getFrequentRenterPoints();
    	}
    	return totalFrequentRenterPoints;
    }

   
}
    