package com.jgiles.bfu.main;

public class AuthoredTxt {
	private double cost; 
	private String sid; 
	private AuthoredTxtSpec authoredtxtSpec;
	
	public AuthoredTxt(AuthoredTxtSpec authoredtxtSpec, String sid, double cost) {
		this.authoredtxtSpec = authoredtxtSpec;
		this.sid = sid;
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getSid() {
		return sid;
	}

	public AuthoredTxtSpec getSpec() {
		return authoredtxtSpec;
	}

	@Override
	public String toString() {
		return "AuthoredTxt [cost=" + cost + ", sid=" + sid + ", authoredtxtSpec=" + authoredtxtSpec
				+ "]";
	}


}
