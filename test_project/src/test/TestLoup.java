package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.Loup;
import main.Orientation;

class TestLoup {

	Loup lp;
	@BeforeEach
	void setUp() throws Exception {
		lp = new Loup();
	}

	@AfterEach
	void tearDown() throws Exception {
		lp = null;
	}
	
	@Test
	void testPositionInitialeAuNord() {
		assertEquals(Orientation.Nord, lp.getOrientation() );
	}
	
	@Test
	void testTourner() {
		lp.tourner();
		assertEquals(Orientation.Est, lp.getOrientation());
	}
	
	

}
