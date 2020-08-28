/**
 * @author shahid
 */
package com.shaheed.pmm.request;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

public class BasicRequest implements Serializable{

	/**
	 * Generated serial version Id
	 */
	private static final long serialVersionUID = 4032069836211082508L;
	
	@Getter
	@Setter	
	private String username;
	

}
