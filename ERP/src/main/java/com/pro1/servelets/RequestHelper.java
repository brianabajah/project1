package com.pro1.servelets;

import javax.servlet.http.HttpServletRequest;

public class RequestHelper {

	public String fwd(HttpServletRequest req) {
		
		
		switch(req.getRequestURI()) {
		case "create.me":
			return"html/cAccount.html";
		case "goHome.me":
			return "html/index.html";
		default:
			return "index.html";
			
		}
		
	}
	
}
