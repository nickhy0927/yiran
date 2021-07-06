package com.netfinworks.biz.common.util;

public class BaseResult {

	private Boolean success;

	private String resultMessage;

	public BaseResult() {
	}

	public BaseResult(boolean b, String message) {
		this.success = b;
		this.resultMessage = message;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getResultMessage() {
		return resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
}
