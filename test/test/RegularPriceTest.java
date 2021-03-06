package test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import movierental.Price;
import movierental.RegularPrice;

public class RegularPriceTest {

	@Test
	public void getCorrectAmountRegularPriceTest() {
		Price regularPrice = new RegularPrice();
		int daysRented = 1;
		assertEquals(2, regularPrice.getAmount(daysRented), 0.0001);

		int daysRented2 = 3;
		assertEquals(5, regularPrice.getAmount(daysRented2), 0.0001);

	}

	@Test
	public void getCorrectFrequentRenterPoitnsTest() {
		Price regularPrice = new RegularPrice();
		int daysRented = 1;
		assertEquals(1, regularPrice.getFreqentRenterPoints(daysRented));
	}
}
