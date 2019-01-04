package com.general;

public class UtilException extends Exception {

	String errMsg;

	public UtilException(String errMsg) {
		super();
		this.errMsg = errMsg;
	}

	@Override
	public String getMessage() {
		return super.getMessage() + errMsg;

	}

}
