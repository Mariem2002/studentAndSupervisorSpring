package test;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.Calculator;

class TestCalculator {
	Calculator cal;

	@BeforeEach
	void setUp() throws Exception {
		cal = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		cal = null;
	}

	@Test
	@DisplayName("Tester evaluate ")
	void testevaluate() {
		int sum = cal.evaluate("1+2+3");
		assertEquals(6, sum);
	}

	@Test
	@Disabled("for demonstration purposes")
	void skippedTest() {
// not executed
}
	@ParameterizedTest
	@ValueSource(strings = {"100+100" })
	void testevaluatewithparam(String ch) {
	int sum = cal.evaluate(ch);
	assertEquals(200, sum);
	}
	
	@Test 
	void GroupedTest() {
		assertAll("Operations", () -> assertEquals(10, cal.add(6,4)), () -> assertEquals(20, cal.add(6,14)), () -> assertEquals(20, cal.add(6,14)), () -> assertThrows(ArithmeticException.class, () -> { cal.divide(3,0); })  );
	}
	@Disabled
	@Test 
	void ZeroDivisionTest() {
		assertThrows(ArithmeticException.class, () -> { cal.divide(3,0); })  ;
	}
	@Test 
	void ZeroDivisionTMsgest() {
		Exception exception = assertThrows(ArithmeticException.class, () -> cal.divide(1, 0));
		assertEquals("Division par zero !", exception.getMessage())  ;
	}
	
	@DisplayName ("Testcase for Multiplication")
	@RepeatedTest (5)
	void testrepeatedmultiply () {
	int a, b;
	a=10;
	b=20;
	assertEquals(200, (cal.multiply(a, b)), "Matched. Test status - Passed");

	}
	
}
	
