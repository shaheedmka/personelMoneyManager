/**
 * @author shaheed
 * */
package com.shaheed.pmm.web.serviceImpl;

import org.springframework.stereotype.Component;

import com.shaheed.pmm.web.service.SignInService;

/**
 * @see com.shaheed.pmm.web.service.SignInService(java.lang.String userName, java.lang.String password)
 * */
@Component
public class SignInServiceImpl implements SignInService{

	@Override
	public boolean validateUser(String userName, String password) {
		return userName.equalsIgnoreCase("shaheed")
				&& password.equalsIgnoreCase("shaheed");
	}

}
