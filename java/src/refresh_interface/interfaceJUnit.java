package refresh_interface;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class interfaceJUnit {
	Bert b = new Bert();
	
	@Test
	void teststudy() {
		assertEquals("Bert is studying class material.", b.study());
	}
	
	@Test
	void testresearch() {
		assertEquals("Bert is doing a research for his team project.", b.research());
	}
	
	@Test
	void testtakeTest() {
		assertEquals("Bert is taking exam in a classroom.", b.takeTest());
	}
}
