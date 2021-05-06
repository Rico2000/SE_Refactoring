public class Movie {
	private String title;
	private Price price;

	public Movie(String newtitle, Price price) {
		title = newtitle;
		this.price = price;
	}

	public Price getPriceCode() {
		return price;
	}

	public void setPriceCode(Price price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	};

	public double getAmount(int daysRented) {
		return price.getAmount(daysRented);
	}

	public int getFrequentRenterPoints(int daysRented) {
		return price.getFreqentRenterPoints(daysRented);

	}
}