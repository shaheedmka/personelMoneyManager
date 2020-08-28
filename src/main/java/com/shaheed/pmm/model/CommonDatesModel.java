/**
 * @author shaheed
 **/
package com.shaheed.pmm.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(
        value = {"createdDate", "modifiedDate"},
        allowGetters = true
)
@Getter
@Setter
public abstract class CommonDatesModel implements Serializable {
	
	/**
	 * Generated Serial Version UID
	 * */
	private static final long serialVersionUID = 4497811132376892117L;

	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date", nullable = false, updatable = false)
    @CreatedDate
	protected Date createdDate;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modified_date", nullable = false)
    @LastModifiedDate
	protected Date modifiedDate;

}
