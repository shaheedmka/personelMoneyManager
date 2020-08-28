/**
 * @author shaheed
 * */
package com.shaheed.pmm.serviceImpl;

import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shaheed.pmm.model.PersonModel;
import com.shaheed.pmm.repository.PersonModelRepository;
import com.shaheed.pmm.request.BasicRequest;
import com.shaheed.pmm.service.SignInService;

/**
 * @see com.shaheed.pmm.web.service.SignInService(com.shaheed.pmm.request.BasicRequest request)
 * */
@Service
public class SignInServiceImpl implements SignInService{
	
	@Autowired
	private PersonModelRepository personModelRepository;

	@Override
	public boolean validateUser(BasicRequest req) {
		if(req != null && StringUtils.isNotBlank(req.getUsername()))
		{
			Optional<PersonModel> person = personModelRepository.findByUserName(req.getUsername());
			return person.isPresent();
		}
		return false;
	}

}
