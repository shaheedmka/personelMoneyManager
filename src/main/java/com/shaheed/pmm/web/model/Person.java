/**
 * @author shaheed
 * */
package com.shaheed.pmm.web.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
@Entity
public class Person {

	@Id	
	private Long personId;
	private String userName;
	private String personFirstName;
	private String personLastName;
	private String emailId;
	private String mobileNumber;
	private String address;
	private LocalDate createdDate;
	private LocalDate modifiedDate;
	private Boolean isActive;
	
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", userName=" + userName + ", personFirstName=" + personFirstName
				+ ", personLastName=" + personLastName + ", emailId=" + emailId + ", mobileNumber=" + mobileNumber
				+ ", address=" + address + ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate
				+ ", isActive=" + isActive + "]";
	}
}
