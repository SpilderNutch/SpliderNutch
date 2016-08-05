package com.yutian.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class BaseController {

	static final Log logger = LogFactory.getLog(BaseController.class);
	
	private HttpServletRequest request;
	
	@ModelAttribute
	public void setRequest(HttpServletRequest request){
		this.request = request;
	}

	public HttpSession getSession(){
		return request.getSession();
	}
	
	
	
	
	
}
