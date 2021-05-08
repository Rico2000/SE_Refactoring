package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import movierental.ChildrenPrice;
import movierental.Customer;
import movierental.Movie;
import movierental.Rental;

public class CustomerTest {

	@Test
	public void testStatment() {
		Customer testCustomer1 = new Customer("testCustomer");
		String expected1 = "Rental Record for testCustomer\n" + "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount"
				+ "\n" + "Amount owed is 0.0\n" + "You earned 0 frequent renter points";
		assertEquals(expected1, testCustomer1.statement());

		Customer testCustomer2 = new Customer("testCustomer2");
		Movie testMovie = new Movie("testMovie", new ChildrenPrice());
		Rental testRental = new Rental(testMovie, 20);
		testCustomer2.addRental(testRental);
		String expected2 = "Rental Record for testCustomer2\n" + "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount"
				+ "\n" + "\ttestMovie\t\t20\t27.0\n" + "Amount owed is 27.0\n" + "You earned 1 frequent renter points";

		assertEquals(expected2, testCustomer2.statement());

		Rental testRental2 = new Rental(testMovie, 5);
		testCustomer2.addRental(testRental2);

		String expected3 = "Rental Record for testCustomer2\n" + "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount"
				+ "\n" + "\ttestMovie\t\t20\t27.0\n\ttestMovie\t\t5\t4.5\n" + "Amount owed is 31.5\n"
				+ "You earned 2 frequent renter points";
		assertEquals(expected3, testCustomer2.statement());

	}

}
