
public class ChildrensPrice implements Price {

	@Override
	public double getAmount(int daysRented) {
		if(daysRented > 3) {
			return 1.5+ (daysRented - 3) * 1.5;
		}else {
			return 1.5;
		}
	}

	@Override
	public int getFreqentRenterPoints(int daysRented) {
		return 1;
	}

}
