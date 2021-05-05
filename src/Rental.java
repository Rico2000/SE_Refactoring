class Rental {
    private Movie movie;
    private int daysRented;
    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }
    public double getAmount() {
        double thisAmount = 0;
        switch (movie.getPriceCode()) {
            case REGULAR:
                thisAmount += 2;
                if (this.getDaysRented() > 2)
                    thisAmount += (this.getDaysRented() - 2) * 1.5;
                break;
            case NEW_RELEASE:
                thisAmount += this.getDaysRented() * 3;
                break;
            case CHILDRENS:
                thisAmount += 1.5;
                if (this.getDaysRented() > 3)
                    thisAmount += (this.getDaysRented() - 3) * 1.5;
                break;
        }
        return thisAmount;
    }
    public int getFrequentRenterPoints() {
        if ((movie.getPriceCode() == PriceCode.NEW_RELEASE) && this.getDaysRented() > 1) {
        	return 2;
        }else {
        	return 1;
        }
            
    }

}