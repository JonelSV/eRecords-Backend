package com.erecords.agents.model;

public class Agent {
	private double id;
	private String firstName;
	private String lastName;
	private String codeName;
	private String handlerOps;
	
	
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCodeName() {
		return codeName;
	}
	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}
	public String getHandlerOps() {
		return handlerOps;
	}
	public void setHandlerOps(String handlerOps) {
		this.handlerOps = handlerOps;
	}
	public int getAuthCode() {
		return authCode;
	}
	public void setAuthCode(int authCode) {
		this.authCode = authCode;
	}
	private int authCode;

}
