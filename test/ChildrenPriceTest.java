import static org.junit.Assert.*;

import org.junit.Test;

import movierental.ChildrenPrice;
import movierental.Price;

public class ChildrenPriceTest {

	@Test
	public void getCorrectAmountRegularPriceTest() {
		Price regularPrice = new ChildrenPrice();
		int daysRented = 1;
		assertEquals(1.5, regularPrice.getAmount(daysRented), 0.0001);

		int daysRented2 = 3;
		assertEquals(1.5, regularPrice.getAmount(daysRented2), 0.0001);

	}

	@Test
	public void getCorrectFrequentRenterPoitnsTest() {
		Price regularPrice = new ChildrenPrice();
		int daysRented = 1;
		assertEquals(1, regularPrice.getFreqentRenterPoints(daysRented));
	}

}
