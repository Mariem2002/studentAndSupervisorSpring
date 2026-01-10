package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import main.LeapYear;

class TestLeapYear {

	LeapYear leapYear;
	@Test
	void GroupTest() {
		assertAll(()->assertTrue(leapYear.isLeapYear(2000)));
	}
	@BeforeEach
	void setUp() {
		leapYear = new LeapYear();
	}
	
	@ParameterizedTest
	@CsvSource({"2000, true", "1991, false", "1900, false", "2004, true" })
	void test(int year, boolean oracle) {
		
		assertEquals(oracle, leapYear.isLeapYear(year));
	}
	
	
	
	

}
