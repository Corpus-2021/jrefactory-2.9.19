/**
 *  Description of the Class
 *
 *@author    Chris Seguin
 */
public class SwitchClass {
	private final static int ZERO = 0;


	/**
	 *  Description of the Method
	 *
	 *@param  value  Description of Parameter
	 */
	public void method(int value) {
		while (value > 5) {
			switch (value) {
			case 15:
				System.out.println("You guessed the number");
				return;
			case ZERO:
				break;
			case 80:
				value -= 65;
				continue;
			case 32:
			{
				value--;
			}

			default:
				if (value % 2 == 0) {
					value -= 2;
				}
				else {
					value--;
				}
				break;
			}
		}
	}
}
