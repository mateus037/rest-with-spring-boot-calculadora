package br.com.erudio.restwithspringbootudemy.services;

import org.springframework.stereotype.Service;

@Service
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
