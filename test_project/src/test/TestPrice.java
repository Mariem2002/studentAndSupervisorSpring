package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Price;

class TestPrice {
	Price price;
	@BeforeEach
	void setUp() throws Exception{
		price = new Price();
	}
	@AfterEach
	void TearDown() throws Exception{
		price = null;
	}
	@Test
	void testGetTTC() {
		assertEquals(119, price.getTTC(100));
	}

}
