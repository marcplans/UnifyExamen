package com.unify.utilities;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE, reason = "Invalid Parameters")
public class InvalidParamException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidParamException() {

	}

}
