package com.round.cycle.fun.exception;

import java.io.Serializable;

public enum CustomInfo implements Serializable {
	NO_AUTH(20080000,"NO AUTH",3),
	QUEUE_EXISTS(20080001,"QUEUE EXISTS",3),
	QUEUE_IN_USE(20080002,"QUEUE_IN_USE",3),
	NO_AVAILABLE_ACTION(20080003,"NO AVAILABLE ACTION",3),
	SYSTEM_ERROR(20080004,"SYSTEM ERROR",4),
	BAD_REQUEST(20080005,"BAD REQUEST",3),
	NO_FUNCTION(20080007, "INTERFACE NOT EXIST", 3),
	INVALID_PARAMS(20080006, "INVALID PARAMS", 3);
	private int errCode;

	private String description;

	private int level;

	CustomInfo(int errCode, String description, int level) {
		this.errCode = errCode;
		this.description = description;
	}

	public int getErrCode() {
		return errCode;
	}

	public void setErrCode(int errCode) {
		this.errCode = errCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
