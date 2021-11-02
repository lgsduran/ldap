package br.com.ldap.exception;

import static org.springframework.http.HttpStatus.UNPROCESSABLE_ENTITY;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = UNPROCESSABLE_ENTITY)
public class InfoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InfoException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
