package collection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class collectionJUnit {
	collection test = new collection();
	
	@Test
	void testcontains() {
		boolean output = test.contain(37);
		assertEquals(false, output);
	}
	
	@Test
	void testget() {
		int output = test.get(7);
		assertEquals(66, output);
	}
	
	@Test
	void testprintList() {
		String output = test.printList();
		assertEquals("3 12 21 30 39 48 57 66 75 84 ", output);
	}
}
