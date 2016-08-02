package com.yutian.service;

import java.util.Map;

import com.yutian.model.UserInfo;

public interface UserInfoService{
	
	UserInfo getUserInfoById(String id);
	
	UserInfo getUserByUserInfo(UserInfo userInfo);

	UserInfo getUserByUserAPass(Map paramMap);
	
}
