//  Refactoring, a First Example, step1, (~p5)

import java.util.*;

/**
 *  Description of the Class
 *
 *@author    Chris Seguin
 */
public class Movie {

	private String _title;// �W��
	private int _priceCode;
	/**
	 *  Description of the Field
	 */
	public final static int CHILDRENS = 2;
	/**
	 *  Description of the Field
	 */
	public final static int REGULAR = 0;
	/**
	 *  Description of the Field
	 */
	public final static int NEW_RELEASE = 1;// ����


			/**
	 *  Constructor for the Movie object
	 *
	 *@param  title      Description of Parameter
	 *@param  priceCode  Description of Parameter
	 */
	public Movie(String title, int priceCode) {
		_title = title;
		_priceCode = priceCode;
	}


	/**
	 *  Sets the PriceCode attribute of the Movie object
	 *
	 *@param  arg  The new PriceCode value
	 */
	public void setPriceCode(int arg) {
		_priceCode = arg;
	}


	/**
	 *  Gets the PriceCode attribute of the Movie object
	 *
	 *@return    The PriceCode value
	 */
	public int getPriceCode() {
		return _priceCode;
	}


	/**
	 *  Gets the Title attribute of the Movie object
	 *
	 *@return    The Title value
	 */
	public String getTitle() {
		return _title;
	}

	// jjhou add
	/**
	 *  The main program for the Movie class
	 *
	 *@param  args  The command line arguments
	 */
	public static void main(String[] args) {
		System.out.println("Refactoring, a First Example, step1");

		Movie m1 = new Movie("Seven", Movie.NEW_RELEASE);
		Movie m2 = new Movie("Terminator", Movie.REGULAR);
		Movie m3 = new Movie("Star Trek", Movie.CHILDRENS);

		Rental r1 = new Rental(m1, 4);
		Rental r2 = new Rental(m1, 2);
		Rental r3 = new Rental(m3, 7);
		Rental r4 = new Rental(m2, 5);
		Rental r5 = new Rental(m3, 3);

		Customer c1 = new Customer("jjhou");
		c1.addRental(r1);
		c1.addRental(r4);

		Customer c2 = new Customer("gigix");
		c2.addRental(r1);
		c2.addRental(r3);
		c2.addRental(r2);

		Customer c3 = new Customer("jiangtao");
		c3.addRental(r3);
		c3.addRental(r5);

		Customer c4 = new Customer("yeka");
		c4.addRental(r2);
		c4.addRental(r3);
		c4.addRental(r5);

		System.out.println(c1.statement());
		System.out.println(c2.statement());
		System.out.println(c3.statement());
		System.out.println(c4.statement());
	}
}

/**
 *  Description of the Class
 *
 *@author    Chris Seguin
 */
class Rental {


	private Movie _movie;// �v��
	private int _daysRented;// ����


			/**
	 *  Constructor for the Rental object
	 *
	 *@param  movie       Description of Parameter
	 *@param  daysRented  Description of Parameter
	 */
	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}


	/**
	 *  Gets the DaysRented attribute of the Rental object
	 *
	 *@return    The DaysRented value
	 */
	public int getDaysRented() {
		return _daysRented;
	}


	/**
	 *  Gets the Movie attribute of the Rental object
	 *
	 *@return    The Movie value
	 */
	public Movie getMovie() {
		return _movie;
	}
}

/**
 *  Description of the Class
 *
 *@author    Chris Seguin
 */
class Customer {


	private String _name;// �m�W
	private Vector _rentals = new Vector();// ���ɰO��


			/**
	 *  Constructor for the Customer object
	 *
	 *@param  name  Description of Parameter
	 */
	public Customer(String name) {
		_name = name;
	}


	/**
	 *  Gets the Name attribute of the Customer object
	 *
	 *@return    The Name value
	 */
	public String getName() {
		return _name;
	}


	/**
	 *  Adds a feature to the Rental attribute of the Customer object
	 *
	 *@param  arg  The feature to be added to the Rental attribute
	 */
	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}


	/**
	 *  Description of the Method
	 *
	 *@return    Description of the Returned Value
	 */
	public String statement() {
		double totalAmount = 0;// �`���O���B
		int frequentRenterPoints = 0;// �`�ȿn�I
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";

		while (rentals.hasMoreElements()) {
			double thisAmount = 0;
			Rental each = (Rental) rentals.nextElement();// ���o�@�����ɰO��

			//determine amounts for each line
			switch (each.getMovie().getPriceCode()) {// ���o�v���X������
				case Movie.REGULAR:// ���q��
					thisAmount += 2;
					if (each.getDaysRented() > 2) {
						thisAmount += (each.getDaysRented() - 2) * 1.5;
					}
					break;
				case Movie.NEW_RELEASE:// �s��
					thisAmount += each.getDaysRented() * 3;
					break;
				case Movie.CHILDRENS:// �ൣ��
					thisAmount += 1.5;
					if (each.getDaysRented() > 3) {
						thisAmount += (each.getDaysRented() - 3) * 1.5;
					}
					break;
			}

			// add frequent renter points�]�֥[ �`�ȿn�I�^
			frequentRenterPoints++;
			// add bonus for a two day new release rental
			if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
					each.getDaysRented() > 1) {
				frequentRenterPoints++;
			}

			// show figures for this rental�]��ܦ������ɸ�ơ^
			result += "\t" + each.getMovie().getTitle() + "\t" +
					String.valueOf(thisAmount) + "\n";
			totalAmount += thisAmount;
		}

		// add footer lines�]�����C�L�^
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints) +
				" frequent renter points";
		return result;
	}
}
