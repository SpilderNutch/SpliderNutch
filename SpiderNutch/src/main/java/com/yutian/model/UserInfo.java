package com.yutian.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class UserInfo {

	private Integer id;
	
	private String username;
	
	private String lastname;
	
	private String password;

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
				.append("id:"+getId())
				.append("userName:",getUsername())
				.append("lastname",getLastname())
				.append("password:",getPassword())
				.toString();
	}
	
	
	
}
