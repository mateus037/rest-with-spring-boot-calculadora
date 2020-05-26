package br.com.erudio.restwithspringbootudemy.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsoportedMathOperationException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public UnsoportedMathOperationException(String exception) {
		super(exception);
	}
}
