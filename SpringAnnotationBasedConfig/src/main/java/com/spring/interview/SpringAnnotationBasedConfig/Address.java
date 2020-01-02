package com.spring.interview.SpringAnnotationBasedConfig;


import org.springframework.stereotype.Component;

@Component
public class Address {

	private int pin;
	private String city;
	public void setPin(int pin) {
		this.pin = pin;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public void Addressinfo()
	{
		System.out.println("Pin=245208 and City=Meerut");
	}
	
}
