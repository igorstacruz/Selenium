package task;

class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public double calculateAmount(){
        double amount = 0;
        switch (_movie.getPriceCode()) {
            case Movie.REGULAR:
                amount += 2;
                if (_daysRented > 2)
                    amount += (_daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                amount += _daysRented * 3;
                break;
            case Movie.CHILDRENS:
                amount += 1.5;
                if (_daysRented > 3)
                    amount += (_daysRented - 3) * 1.5;
                break;
        }
        return amount;
    }

    public int calculateCurrentRenterPoints() {
        int frequentRenterPoints = 1;
        // add bonus for a two day new release rental
        if ((_movie.getPriceCode() == Movie.NEW_RELEASE)
                &&
                _daysRented > 1) frequentRenterPoints++;
        return frequentRenterPoints;
    }
}