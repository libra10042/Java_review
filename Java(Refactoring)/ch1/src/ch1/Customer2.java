package ch1;

import java.util.Enumeration;
import java.util.Vector;
//@desc refactoring �� class
public class Customer2 {
	private String _name;
	private Vector<Rental> _rentals = new Vector();

	public Customer2(String name) {
		_name = name;
	}

	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}

	public String getName() {
		return _name;
	}
	
	private double amountFor(Rental aRental) {
		return aRental.getCharge();
	}
	
	

	public String statement() {
		int frequentRenterPoints = 0;
		Enumeration<Rental> rentals = _rentals.elements();
		String result = getName() + " ������ �뿩 ���\n";
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();

			//��쿡 ���� ���� ����Ʈ ���� �Լ��� ȣ��
			frequentRenterPoints += each.getFrequentRenterPoints();

			// �̹��� �뿩�ϴ� ���� ������ �뿩�Ḧ ���
			result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";

		}
		// Ǫ�� �� �߰�
		result += "���� �뿩�� : " + String.valueOf(getTotalCharge()) + "\n";
		result += "���� ����Ʈ : " + String.valueOf(getTotalFrequentRenterPoints());
		return result;

	}
	
	//���� ���� ������ �� �뿩��
	private double getTotalCharge() {
		double result = 0; 
		Enumeration<Rental> rentals = _rentals.elements();
		while(rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getCharge();
		}
		return result; 
	}

	private int getTotalFrequentRenterPoints() {
		int result = 0; 
		Enumeration<Rental>	 rentals = _rentals.elements();
		while(rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result; 
	}
	
	
	
	
}
