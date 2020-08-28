/**
 * @author shaheed
 * */
package com.shaheed.pmm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
@Table(name = "person")
public class PersonModel extends CommonDatesModel{

	/**
	 * Generated Serial Version UID
	 **/
	private static final long serialVersionUID = -4406091364609908184L;
	
	@GeneratedValue(generator = "person_person_id_seq")
	@SequenceGenerator(
	         name = "person_person_id_seq",
	         sequenceName = "person_person_id_seq",
	         initialValue = 10)
	@Id
	@Setter
	@Getter
	private Long personId;
	
	@Column(name = "username", nullable = false, unique = true)
	@NotBlank
	@Size(min = 7)
	@Setter
	@Getter
	private String userName;
	
	@Column(name = "person_first_name", nullable = false)
	@NotBlank
	@Setter
	@Getter
	private String personFirstName;
	
	@Column(name = "person_last_name")
	@Setter
	@Getter
	private String personLastName;
	
	@Column(name = "email_id", nullable = false, unique = true)
	@NotBlank
	@Setter
	@Getter
	private String emailId;
	
	@Column(name = "mobile_number", nullable = false, unique = true)
	@NotBlank
	@Size(min = 10, max = 14)
	@Setter
	@Getter
	private String mobileNumber;
	
	@Column(name = "address")
	@Setter
	@Getter
	private String address;
	
	@Column(name = "is_active")
	@Setter
	@Getter
	private Boolean isActive;
	
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", userName=" + userName + ", personFirstName=" + personFirstName
				+ ", personLastName=" + personLastName + ", emailId=" + emailId + ", mobileNumber=" + mobileNumber
				+ ", address=" + address + ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate
				+ ", isActive=" + isActive + "]";
	}
}
