package ch1;

public class Rental {
	private Movie _movie;
	private int _daysRented;

	public Rental(Movie _movie, int _daysRented) {
		super();
		this._movie = _movie;
		this._daysRented = _daysRented;
	}

	public int getDaysRented() {
		return _daysRented;
	}

	public Movie getMovie() {
		return _movie;
	}

	
	
	
	
	//�ֽŹ��� ��Ʋ �̻� �뿩�ϸ� 2����Ʈ �����ϰ� �� �ܿ� 1����Ʈ �����ϴ� �ڵ带
	//���� getFrequentRenterPoints �޼���� ����� �� Rental Ŭ������ �Ű��.
	int getFrequentRenterPoints() {
		if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1)
			return 2; 
		else 
			return 1;
	}
	

}
