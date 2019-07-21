/**
 * @author shaheed
 * */
package com.shaheed.pmm.web.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CredentialMapping {
	
	private Long credentialMappingId;
	private Long personId;
	private String password; 
	
	@Override
	public String toString() {
		return "CredentialMapping [credentialMappingId=" + credentialMappingId + ", personId=" + personId
				+ ", password=" + password + "]";
	}

}
