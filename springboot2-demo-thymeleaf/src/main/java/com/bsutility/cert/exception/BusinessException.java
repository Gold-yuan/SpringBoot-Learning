package com.bsutility.cert.exception;

/**
 * @author adminytf
 *
 */
public class BusinessException extends Exception {
	private static final long serialVersionUID = 1L;

	private ExceptionEnum exceptionEnum;

	public BusinessException() {

	}

	public BusinessException(String msg) {
		this.exceptionEnum = ExceptionEnum.BUSINESS_ERROR.setErrorMsg(msg);
	}

	public BusinessException(ExceptionEnum exceptionEnum) {
		this.exceptionEnum = exceptionEnum;
	}

	public ExceptionEnum getExceptionEnum() {
		return exceptionEnum;
	}

	public void setExceptionEnum(ExceptionEnum exceptionEnum) {
		this.exceptionEnum = exceptionEnum;
	}

	public String getErrorMsg() {
		return this.exceptionEnum.getErrorMsg();
	}

	public String getErrorCode() {
		return this.exceptionEnum.getErrorCode();
	}

}
