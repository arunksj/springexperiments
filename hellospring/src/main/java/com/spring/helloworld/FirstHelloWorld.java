package com.spring.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.web.bind.annotation.InitBinder;


public class FirstHelloWorld {
	private String userId;

	/**
	 * @param args
	 */
	
	@InitBinder
	@DependsOn
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
	
	@Bean
	public UserBean getUser() {
		String myName = "Hello World";
		System.out.println(myName);
		return new UserBean();
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserId() {
		return userId;
	}
}
