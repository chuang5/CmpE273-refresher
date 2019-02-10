package array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class arrayJUnit {
	array test = new array();
	
	@Test
	void testfind() {
		int output = test.find(0);
		assertEquals(39, output);
	}
	
	@Test
	void testsize() {
		int output = test.size();
		assertEquals(5, output);
	}
	
	@Test
	void testprintArray() {
		String output = test.printArray();
		assertEquals("39 52 65 78 91 ", output);
	}

}
