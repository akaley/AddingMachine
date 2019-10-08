package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest {

	@Test
	void testAdd() // tests empty string ("") 
	{
		AddingMachine addTest = new AddingMachine(); // AddingMachine is tested
		
		addTest.add(5);
		assertEquals(5, addTest.getTotal());
	}

	@Test
	void testSub() // tests empty string ("") 
	{
		AddingMachine subTest = new AddingMachine(); // AddingMachine is tested
		
		subTest.subtract(5);
		assertEquals(-5, subTest.getTotal());
	}
	
	@Test
	void testMultipleOp() // tests empty string ("") 
	{
		AddingMachine many = new AddingMachine(); // AddingMachine is tested
		
		many.add(5);
		many.subtract(5);
		many.add(50);
		many.subtract(15);
		many.subtract(3);;
		many.add(1);
		many.add(2);
		assertEquals(35, many.getTotal());
	}
	
	@Test
	void testPrint() // tests empty string ("") 
	{
		AddingMachine print = new AddingMachine(); // AddingMachine is tested
		
		print.add(5);
		assertEquals("AddingMachine.add (5);\n0 + 5 ", print.toString());
		
	}
	
	@Test
	void testPrintMult() // tests empty string ("") 
	{
		AddingMachine multPrint = new AddingMachine(); // AddingMachine is tested
		
		multPrint.add(5);
		multPrint.subtract(2);
		multPrint.add(10);
		assertEquals("AddingMachine.add (5);\nAddingMachine.subtract (2);\n"
				+ "AddingMachine.add (10);\n0 + 5 - 2 + 10 ", multPrint.toString());
		
	}
}
