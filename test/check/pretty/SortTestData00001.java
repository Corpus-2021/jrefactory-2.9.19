package pretty;

/**
 *  Description of the Class
 *
 *@author    Chris Seguin
 */
public class SortTestData {
	/**
	 *  Description of the Field
	 */
	public int code4;
	/**
	 *  Description of the Field
	 */
	protected int code3;
	final int code2;
	private int code;


	/**
	 *  The main program for the SortTestData class
	 *
	 *@param  args  The command line arguments
	 */
	public static void main(String[] args) {
		SortTestData std = new SortTestData();
		std.setCode(69);
		std.run();
	}


	/**
	 *  Constructor for the SortTestData object
	 */
	public SortTestData() {
		code = 2;
	}


	/**
	 *  Sets the Code attribute of the SortTestData object
	 *
	 *@param  value  The new Code value
	 */
	public void setCode(int value) {
		code = value;
	}


	/**
	 *  Gets the Code attribute of the SortTestData object
	 *
	 *@return    The Code value
	 */
	public int getCode() {
		return value;
	}


	/**
	 *  Main processing method for the SortTestData object
	 */
	public void run() {
		System.out.println("The code is " + code);
	}
}
