package com.shaheed.pmm.response;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;


public class Response implements Serializable{
	
	
	/**
	 * Generated serial version Id
	 */
	private static final long serialVersionUID = -6621226902942428838L;
	
	@Override
	public String toString() {
		return "Response [statusCode=" + statusCode + ", statusDescription=" + statusDescription + "]";
	}
	@Setter
	@Getter	
	private int statusCode;
	
	@Setter
	@Getter	
	private String statusDescription;

}
