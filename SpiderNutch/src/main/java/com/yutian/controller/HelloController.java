package com.yutian.controller;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.common.base.Stopwatch;
import com.yutian.model.UserInfo;
import com.yutian.service.UserInfoService;

@Controller
public class HelloController {

	private static final Log logger = LogFactory.getLog(HelloController.class);
	
	@Resource(name="userInfoService")
	private UserInfoService userInfoService;
	
	@RequestMapping(value="hello")
	public String hello(Model model){
		Stopwatch sw = Stopwatch.createStarted();
		
		
		logger.info("HelloController hello method had invoked!");
		
		UserInfo userinfo = userInfoService.getUserInfoById("111");
		System.out.println(userinfo);
		
		sw.stop();
		logger.info("hello method :"+sw.toString()); 
		
		return "index.jsp";
	}

	
	
	
	
	
	
}
