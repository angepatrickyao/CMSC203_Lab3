import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	private GradeBook fallGr;
	private GradeBook spGr;

	@BeforeEach
	void setUp() throws Exception {
		fallGr = new GradeBook(5);
		fallGr.addScore(56);
		fallGr.addScore(89);
		fallGr.addScore(90);
		
		spGr = new GradeBook(5);
		spGr.addScore(98);
		spGr.addScore(40);
		spGr.addScore(25);
	}

	@AfterEach
	void tearDown() throws Exception {
		fallGr=null;
		spGr=null;
	}

	@Test
	void testAddScore() {
		
		assertTrue(fallGr.toString().equals("56.0 89.0 90.0 "));
		assertTrue(spGr.toString().equals("98.0 40.0 25.0 "));
		assertEquals(fallGr.getScoreSize(), 3);
		assertEquals(spGr.getScoreSize(), 3);
	}

	@Test
	void testSum() {
		assertEquals(fallGr.sum(),235, .0001);
		assertEquals(spGr.sum(),163, .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(fallGr.minimum(),56, .001);
		assertEquals(spGr.minimum(),25, 0.001);
	}

	@Test
	void testFinalScore() {
		assertEquals(fallGr.finalScore(),179, .0001);
		assertEquals(spGr.finalScore(),138, .0001);
	}

}
