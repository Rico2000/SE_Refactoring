package movierental;

public interface Price {
	double getAmount(int daysRented);

	int getFreqentRenterPoints(int daysRented);

}
