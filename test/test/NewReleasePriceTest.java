package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import movierental.NewRealsePrice;
import movierental.Price;

public class NewReleasePriceTest {

	@Test
	public void getCorrectAmountRegularPriceTest() {
		Price newRealesePrice1 = new NewRealsePrice();
		int daysRented = 1;
		assertEquals(3, newRealesePrice1.getAmount(daysRented), 0.0001);

		int daysRented2 = 3;
		assertEquals(9, newRealesePrice1.getAmount(daysRented2), 0.0001);

	}

	@Test
	public void getCorrectFrequentRenterPoitnsTest() {
		Price newRealesePrice1 = new NewRealsePrice();
		int daysRented = 1;
		assertEquals(1, newRealesePrice1.getFreqentRenterPoints(daysRented));
		
		int daysRented2 = 2;
		assertEquals(2, newRealesePrice1.getFreqentRenterPoints(daysRented2));
		
	}

}
