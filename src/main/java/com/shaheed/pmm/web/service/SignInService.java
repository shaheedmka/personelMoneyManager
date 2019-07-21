/**
 * @author shaheed
 * */
package com.shaheed.pmm.web.service;

public interface SignInService {

	/**
	 * Service to authenticate user
	 * @param userName
	 * @param password
	 * @return 
	 * */
	public boolean validateUser(String userName, String password);
}
