package cse360assign2;

/**
 * This class implements add, subtract and total.
 * @author purvchauhan
 * @version 1.0
 */
public class AddingMachine {

	//local variables
	private int total;
	private String display;
	
	/**
	 * This constructs an object of type adding machine and sets total = 0.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		display = "0";
	}
	
	/**
	 * This method returns the total.
	 * @return total of type int
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * This adds a number of type int to total.
	 * @param value
	 */
	public void add (int value) {
		total += value;
		display += " + " + value;
	}
	
	/**
	 * This subtracts a number of type int from total.
	 * @param value
	 */
	public void subtract (int value) {
		total -= value;
		display += " - " + value;
	}
		
	/**
	 * This keeps a history of all the operations performed
	 * and returns a string.
	 * @return history of operations performed as a string
	 */
	public String toString () {
		return display;
	}

	/**
	 * This clears all history and reset the total to 0.
	 */
	public void clear() {
		total = 0;
		display = "0";
	}
}
