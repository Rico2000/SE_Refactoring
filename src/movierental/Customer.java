package movierental;

import java.util.*;

public class Customer {
	private String name;
	private ArrayList<Rental> rentals = new ArrayList<Rental>();

	public Customer(String newname) {
		name = newname;
	};

	public void addRental(Rental rental) {
		rentals.add(rental);
	};

	public String getName() {
		return name;
	};

	public String statement() {
		StringBuilder result = new StringBuilder();
		result.append("Rental Record for " + this.getName() + "\n");
		result.append("\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n");

		for (Rental rental : rentals) {
			result.append("\t").append(rental.getMovie().getTitle()).append("\t\t").append(rental.getDaysRented())
					.append("\t").append(String.valueOf(rental.getAmount())).append("\n");

		}

		result.append("Amount owed is ").append(String.valueOf(getTotalAmount())).append("\n");

		result.append("You earned ").append(String.valueOf(getFrequentRenterPoints()))
				.append(" frequent renter points");

		return result.toString();
	}

	private double getTotalAmount() {
		return rentals.stream().mapToDouble(e -> e.getAmount()).sum();

	}

	private int getFrequentRenterPoints() {
		return rentals.stream().mapToInt(e -> e.getFrequentRenterPoints()).sum();
	}

}
