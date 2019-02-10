package generics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class genericsJUnit {
	Double[] doubleArray = { 1.34, 25.1, 3.78, 42.39 };

	@Test
	void testprintArray() {
		String output = generics.printArray(doubleArray);
		assertEquals("1.34 25.1 3.78 42.39 ", output);
	}
	
	@Test
	void testget() {
		double output = generics.get(doubleArray, 3);
		assertEquals(42.39, output);
	}

}
