package com.hrbc.business.domain.common;


import java.io.Serializable;

public class ResponseDTO implements Serializable {

	private boolean success;

	private String message;

	private Object value;

	public ResponseDTO() {
	}

	public ResponseDTO(boolean success, String message, Object value) {
		this.success = success;
		this.message = message;
		this.value = value;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}
