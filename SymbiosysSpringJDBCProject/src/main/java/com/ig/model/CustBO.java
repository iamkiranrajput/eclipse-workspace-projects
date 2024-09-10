package com.ig.model;

public class CustBO {
	
	private Integer custId;
	
	private String custName;
	
	private String custAddr;
	
	private Integer mobileNo;

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddr() {
		return custAddr;
	}

	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}

	public Integer getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Integer mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "CustBO [custId=" + custId + ", custName=" + custName + ", custAddr=" + custAddr + ", mobileNo="
				+ mobileNo + "]";
	}
	
	
	

}
