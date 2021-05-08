package movierental;
public class NewRealsePrice implements Price {

	@Override
	public double getAmount(int daysRented) {
		return daysRented * 3;
	}

	@Override
	public int getFreqentRenterPoints(int daysRented) {
		if (daysRented > 1) {
			return 2;
		} else {
			return 1;
		}
	}

}
