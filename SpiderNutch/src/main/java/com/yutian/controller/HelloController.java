package com.yutian.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.base.Stopwatch;
import com.google.common.collect.Maps;
import com.yutian.model.UserInfo;
import com.yutian.service.UserInfoService;

@Controller
public class HelloController extends BaseController {

	private static final Log logger = LogFactory.getLog(HelloController.class);
	
	@Resource(name="userInfoService")
	private UserInfoService userInfoService;
	
	@RequestMapping(value="/hello")
	public String hello(Model model){
		Stopwatch sw = Stopwatch.createStarted();
		
		logger.info("HelloController hello method had invoked!");
		
		UserInfo userinfo = userInfoService.getUserInfoById("111");
		System.out.println(userinfo);
		
		sw.stop();
		logger.info("hello method :"+sw.toString()); 
		
		return "index.jsp";
	}

	
	@RequestMapping(value="/findUserByName")
	@ResponseBody
	public  Map findUserByName(Model model,HttpServletRequest request,HttpServletResponse response){
		Stopwatch sw = Stopwatch.createStarted();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		Map paramMap = Maps.newHashMap();
		paramMap.put("username", username);
		paramMap.put("password", password);
		
		
		
		logger.info("HelloController findUserByName method had invoked!");
		
		UserInfo userinfo = userInfoService.getUserByUserAPass(paramMap);
		System.out.println(userinfo);
		
		sw.stop();
		logger.info("hello method :"+sw.toString()); 
		
		Map resultMap = Maps.newHashMap();
		resultMap.put("flag", "S");
		resultMap.put("userinfo", userinfo);
		
		return resultMap;
	}
	
	
	
	
	
	
}
