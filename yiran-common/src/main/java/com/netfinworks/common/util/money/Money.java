package com.netfinworks.common.util.money;

import com.yiran.payorder.response.PayFundResult;

public class Money {
	
	private String exp;
	

	public Money(String exp) {
		this.exp = exp;
	}
	
	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public Money getAmount() {
		return null;
	}

	public Double doubleValue() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCurrency() {
		// TODO Auto-generated method stub
		return null;
	}
}
