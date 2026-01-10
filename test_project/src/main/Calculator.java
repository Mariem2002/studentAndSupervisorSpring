package main;

public class Calculator {
	public int evaluate(String expression) {
		int sum = 0;
		for (String summand : expression.split("\\+"))

			sum += Integer.valueOf(summand);
		return sum;
	}

	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return i + j;
	}

	public int divide(int i, int j) {
		// TODO Auto-generated method stub
		if (j == 0)
			throw new ArithmeticException("Division par zero !");
		return i / j;
	}
	
	public int multiply(int i, int j) {
		return i * j;
	}
}