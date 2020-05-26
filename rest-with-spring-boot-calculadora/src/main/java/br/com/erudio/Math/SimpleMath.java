package br.com.erudio.Math;

public class SimpleMath {

	public Double sum(double firstNumber, double secondnumber) {
		return firstNumber + secondnumber;
	}
	
	public Double subtraction(double firstNumber, double secondnumber) {
		return firstNumber - secondnumber;
	}
	
	public Double multiplication(double firstNumber, double secondnumber) {
		return firstNumber * secondnumber;
	}
	
	public Double division(double firstNumber, double secondnumber) {
		return firstNumber / secondnumber;
	}
	
	public Double mean(double firstNumber, double secondnumber) {
		return (firstNumber + secondnumber)/2;
	}
	
	public Double squareRoot(double number) {
		return Math.sqrt(number);
	}
	
}
