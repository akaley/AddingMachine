//Name: Ashton Kaley
//Class: CSE 360
//StudentID: 1211388565
//Assignment: Assignment #2
//Description: This is the AddingMachine Class file, containing functions that
// get the total, add, subtract, send to string, and clear. This assignment is
// meant to give experience with a version control tool.

package cse360assign2;
import java.util.LinkedList;

/**
 * contains 6 methods {@link AddingMachine}, {@link getTotal}, {@link add},
 *  {@link subtract}, {@link toString}, and {@link clear}. This class is meant
 *  to perform addition, subtraction, as well as print out the history of performed actions.
 * 
 * @method AddingMachine	constructor for AddingMachine
 * @method getTotal			returns current total
 * @method add				adds given integer to total
 * @method subtract			subtracts given integer from total
 * @method toString			prints out all performed functions when called
 * @method clear			nothing given in assignment folder, left empty
 */
public class AddingMachine {
	
	// global variables
	LinkedList<Character> symbols; // Linked list holds all symbols of functions performed (ex: +, -)
	
	private int total; // global total
	private int transactionCount; // int used to run through elements of linked list
	LinkedList<Integer> values; // Linked list that holds values passed through add and subtract
	
	private String returnString; // will store the string to be returned in the toString method
	private LinkedList<String> functionPerformed; // linked list holds performed operations (ex: AddingMachine.add)
	
	
	/**
	 * Is the constructor method for {@link public class AddingMachine} and is meant to
	 * create new AddingMachine objects by initializing above global variables / linked lists
	 */
	public AddingMachine () 
	{
		total = 0;  
		transactionCount = 0;
		
		symbols = new LinkedList<Character>();
		values = new LinkedList<Integer>(); 
		functionPerformed = new LinkedList<String>(); 
		
		returnString = "";
		
	}
	
	/**
	 * Is meant to retrieve the current total from AddingMachine class and return it
	 * 
	 * @return	returns the total 
	 */
	public int getTotal ()
	{
		return total;
	}
	
	/**
	 * Is meant to add an integer to the total given an integer, as well as store the passed value, function
	 * performed, and addition symbol within linked lists to be utilized by the toString method
	 * 
	 * @param value	is the passed integer value to be added to the total
	 */
	public void add (int value) 
	{
		total = total + value;
		
		// store function data in lists
		values.addLast(value);
		functionPerformed.addLast("AddingMachine.add ");
		symbols.addLast('+');
	}
	
	/**
	 * Is meant to subtract an integer from the total given an integer, as well as store the passed value, 
	 * function performed, and subtraction symbol within linked lists to be utilized by the toString method
	 * 
	 * @param value is the passed integer value to be subtracted from the total
	 */
	public void subtract (int value)
	{
		total = total - value;
		
		// store function data in lists
		values.addLast(value);
		functionPerformed.addLast("AddingMachine.subtract ");
		symbols.addLast('-');
	}
		
	/**
	 * Is meant to return a string containing all function history (only add and subtract), as well as 
	 * a typical operation representation (ex: 0 + 3 - 1)
	 * 
	 * @return	returns converted string
	 */
	public String toString ()
	{
		transactionCount = 0;
		returnString = "";
		
		while (values.size() > transactionCount)
		{
			returnString = returnString + functionPerformed.get(transactionCount) + "(" + values.get(transactionCount) + ");\n";
			transactionCount++;
		}
		
		transactionCount = 0;
		returnString = returnString + "0 ";
		
		while (values.size() > transactionCount)
		{
			returnString = returnString + symbols.get(transactionCount) + " " + values.get(transactionCount) + " ";
			transactionCount++;
		}
		
		return returnString;
	}

	/**
	 * Nothing given in assignment PDF and I have no use for it
	 */
	public void clear()
	{
		
	}
}
