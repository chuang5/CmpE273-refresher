package queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class queueJUnit {
	
	queue test = new queue();

	@Test
	void testAdd() {
		String output = test.add("adam");
		assertEquals("adam", output);
	}

	@Test
	void testRemove() {
		test.add("adam");
		test.add("betty");
		test.add("cindy");
		test.add("daniel");
		String output = test.remove("daniel");
		assertEquals("daniel", output);
	}
	
	@Test
	void testPrintQueue() {
		test.add("adam");
		test.add("betty");
		test.add("cindy");
		test.add("daniel");
		String output = test.printQueue();
		assertEquals("adam betty cindy daniel ", output);
	}
	
	@Test
	void testPoll() {
		test.add("adam");
		test.add("betty");
		test.add("cindy");
		test.add("daniel");
		String output = test.poll();
		assertEquals("adam", output);
	}
	
	@Test
	void testPeek() {
		test.add("adam");
		test.add("betty");
		test.add("cindy");
		test.add("daniel");
		String output = test.peek();
		assertEquals("adam", output);
	}
	
	@Test
	void testSize() {
		test.add("adam");
		test.add("betty");
		test.add("cindy");
		test.add("daniel");
		int output = test.size();
		assertEquals(4, output);
	}
}
