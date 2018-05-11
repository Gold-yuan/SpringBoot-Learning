package com.bsutility.cert.exception;

/**
 * @author adminytf
 *
 */
public enum ExceptionEnum {
	/** 成功 */
    SUCCESS("CF0000","成功"),
    /** 业务异常 */
    BUSINESS_ERROR("CF9998","业务异常"),
    /** 未知异常 */
    UNKNOWN("CF9999","未知异常"),
	
	
	;

	private String errorCode;
	private String errorMsg;

	ExceptionEnum(String errorCode, String errorMsg) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
    
    
    public String getErrorCode() {
        return errorCode;
    }
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    public String getErrorMsg() {
        return errorMsg;
    }
    public ExceptionEnum setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
}

