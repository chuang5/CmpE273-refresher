package stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class stackJUnit {
	
	stack test = new stack();

	@Test
	void testpush() {
		int output = test.push(3);
		assertEquals(3, output);
	}
	
	@Test
	void testpop() {
		test.push(13);
		test.push(75);
		test.push(68);
		test.push(2);
		int output = test.pop();
		assertEquals(2, output);
	}
	
	@Test
	void testpeek() {
		test.push(13);
		test.push(75);
		test.push(68);
		int output = test.peek();
		assertEquals(68, output);
	}
	
	@Test
	void testsize() {
		test.push(13);
		test.push(75);
		test.push(689);
		int output = test.size();
		assertEquals(3, output);
	}
	
	@Test
	void testprintStack() {
		test.push(13);
		test.push(75);
		test.push(689);
		String output = test.printStack();
		assertEquals("689 75 13 ", output);
	}

}
