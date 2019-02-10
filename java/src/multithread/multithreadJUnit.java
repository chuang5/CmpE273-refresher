package multithread;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class multithreadJUnit {
	multithread test = new multithread("thread1");

	@Test
	void test() {
		assertEquals(5, test.getPriority());
	}

}
