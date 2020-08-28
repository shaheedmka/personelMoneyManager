/**
 * @author shaheed
 * Controller for SignIn and SignUp forms*/
package com.shaheed.pmm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shaheed.pmm.constant.Constants;
import com.shaheed.pmm.request.BasicRequest;
import com.shaheed.pmm.response.Response;
import com.shaheed.pmm.service.SignInService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController	
@RequestMapping("/personelMoneyManager")
@Api(value="Personel Money Manager")
public class SignInController {

	private static final Logger LOG = LoggerFactory.getLogger(SignInController.class);
	
	@Autowired
	SignInService signInService;
	
	@Autowired
	Response response;
	
	@Autowired
	ObjectMapper mapper;
		
	@RequestMapping(value="/validateUserName", method = RequestMethod.POST, produces = "application/json")
	@ApiResponses(value = {@ApiResponse (code = 0, message = "Successful"), @ApiResponse (code = 1, message = "Internal Server Error")	})
	public Response validateUserName(@RequestBody BasicRequest req) throws JsonProcessingException{
		LOG.info("UserName Request {}",mapper.writerWithDefaultPrettyPrinter().writeValueAsString(req));
		boolean isValidUser = signInService.validateUser(req);
		if(isValidUser) {
			response.setStatusCode(Constants.RESPONSE_SUCCESS);
			response.setStatusDescription("User verification Success");
			return response;
			
		} else {
			
			response.setStatusCode(Constants.RESPONSE_FAILURE);
			response.setStatusDescription("Failed to verify user");
			return response;
		}
				
	}

}
