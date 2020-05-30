package br.com.erudio.restwithspringbootudemy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.restwithspringbootudemy.converters.NumberConverter;
import br.com.erudio.restwithspringbootudemy.exception.UnsoportedMathOperationException;
import br.com.erudio.restwithspringbootudemy.services.SimpleMath;

@RestController
public class MathController {
	
	@Autowired
	private SimpleMath simpleMath;

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {

		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsoportedMathOperationException("Please set a numeric value!");
		}
		return simpleMath.sum(NumberConverter.converToDouble(numberOne), NumberConverter.converToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {

		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsoportedMathOperationException("Please set a numeric value!");
		}
		return simpleMath.subtraction(NumberConverter.converToDouble(numberOne), NumberConverter.converToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {

		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsoportedMathOperationException("Please set a numeric value!");
		}
		return simpleMath.multiplication(NumberConverter.converToDouble(numberOne), NumberConverter.converToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {

		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsoportedMathOperationException("Please set a numeric value!");
		}
		return simpleMath.division(NumberConverter.converToDouble(numberOne), NumberConverter.converToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mean(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {

		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsoportedMathOperationException("Please set a numeric value!");
		}
		return simpleMath.mean(NumberConverter.converToDouble(numberOne), NumberConverter.converToDouble(numberTwo));
		
	}
	
	@RequestMapping(value = "/squareRoot/{number}", method = RequestMethod.GET)
	public Double squareRoot(@PathVariable("number") String number)
			throws Exception {

		if (!NumberConverter.isNumeric(number)) {
			throw new UnsoportedMathOperationException("Please set a numeric value!");
		}
		return simpleMath.squareRoot(NumberConverter.converToDouble(number));
	}

}
