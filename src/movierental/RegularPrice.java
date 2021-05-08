package movierental;

public class RegularPrice implements Price {

	@Override
	public double getAmount(int daysRented) {
		if (daysRented > 2) {
			return (2 + (daysRented - 1) * 1.5);
		} else {
			return 2;
		}
	}

	@Override
	public int getFreqentRenterPoints(int daysRented) {
		return 1;
	}

}
