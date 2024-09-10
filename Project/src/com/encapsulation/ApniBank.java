package com.encapsulation;

public class ApniBank {
	
	private long acNo;
	private String ahName;
	private double aBalence;
	private long moNo;

	public long getAcNo() {
		return acNo;
	}
	public String getAhName() {
		return ahName;
	}
	public double getaBalence() {
		return aBalence;
	}
	public long getMoNo() {
		return moNo;
	}
	

	@Override
	public String toString() {
		return "ApniBank [acNo=" + acNo + ", ahName=" + ahName + ", aBalence=" + aBalence + ", moNo=" + moNo + "]";
	}


	public ApniBank(long acNo, String ahName, double aBalence, long moNo) {
		super();
		this.acNo = acNo;
		this.ahName = ahName;
		this.aBalence = aBalence;
		this.moNo = moNo;
	}
	
	
	
	

}
