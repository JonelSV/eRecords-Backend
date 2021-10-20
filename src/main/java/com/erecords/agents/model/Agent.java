package com.erecords.agents.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agents")
public class Agent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "codeName")
	private String codeName;
	
	@Column(name = "handlerOps")
	private String handlerOps;
	
	@Column (name = "authCode")
	private int authCode;
	
	
	public Agent() {
		
	}
	
	public Agent(String firstName, String lastName, String codeName, String handlerOps, int authCode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.codeName = codeName;
		this.handlerOps = handlerOps;
		this.authCode = authCode;
	}
	public double getId() {
		return id;
	}
	public void setId(long id) {
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
	

}
