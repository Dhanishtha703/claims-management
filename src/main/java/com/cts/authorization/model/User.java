package com.cts.authorization.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.cts.authorization.service.CustomIdGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="users")
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @GenericGenerator(
        name = "user_seq", 
        strategy = "com.cts.authorization.service.CustomIdGenerator", 
        parameters = {
            @Parameter(name = CustomIdGenerator.INCREMENT_PARAM, value = "1"),
            @Parameter(name = CustomIdGenerator.VALUE_PREFIX_PARAMETER, value = "CMS_M"),
            @Parameter(name = CustomIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%03d") })
	private String id;
	
	// user name should not be null or empty
	// user name should have at least 2 characters
	@NotEmpty
	@Size(min = 2 , message="user name should have at least 2 characters")
	private String userName;
	
	// password should not be null or empty
	// password should have at least 4 characters
	@NotEmpty
	@Size(min = 4 , message="password should have at least 4 characters")
	private String password;
	
}


