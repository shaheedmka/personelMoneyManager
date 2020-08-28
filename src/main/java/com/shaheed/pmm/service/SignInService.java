/**
 * @author shaheed
 * */
package com.shaheed.pmm.service;

import com.shaheed.pmm.request.BasicRequest;

public interface SignInService {

	/**
	 * Service to authenticate user
	 * @param userName
	 * @param password
	 * @return 
	 * */
	public boolean validateUser(BasicRequest basicRequest);
}
