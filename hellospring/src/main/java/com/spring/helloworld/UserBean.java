package com.spring.helloworld;

import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;


/**
 * Testing some GIT commits!
 * @author arunk
 *
 */

public class UserBean {
	private String userId;
	private String userEmail;
	
	public UserBean() {
		// TODO Auto-generated constructor stub
	}
	
	public String getUserEmail() {
		SpringBeanAutowiringInterceptor foo = null;
		return userEmail;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
