package com.pro1.dtbAccessors;

public class Authentication {
	private String url= System.getenv("URL");
	private String name= System.getenv("NAME");
	private String pass= System.getenv("PASS");
	
	public String getUrl() {
		return url;
	}
	public String getName() {
		return name;
	}
	public String getPass() {
		return pass;
	}
	
}
