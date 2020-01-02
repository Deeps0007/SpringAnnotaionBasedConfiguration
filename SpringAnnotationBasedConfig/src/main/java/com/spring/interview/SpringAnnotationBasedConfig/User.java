package com.spring.interview.SpringAnnotationBasedConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
	
	//@Autowired                        applied on setter method
	private Address address;
	
	@Autowired
	@Qualifier("india")
	private Country country;
	
	@Value("Deepanshu")    // property value can be added as(property )
	private String userName;
	
	
	public void setUserName(String userName) {
		this.userName = userName;
	}



	@Autowired        // @autowired annotation can be applied on both (setter method as well as class reference)
	public void setAddress(Address address) {
		this.address = address;
	}



	public void display()
	{
		address.Addressinfo();
		System.out.println("My name is : "+userName);
		country.countryName();
	}
	

}
