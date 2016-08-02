package com.yutian.mapper;

import java.util.Map;

import com.yutian.model.UserInfo;

public interface UserInfoMapper {

	UserInfo getUserInfoById(String id);

	UserInfo getUserByUserInfo(UserInfo userInfo);

	UserInfo getUserByUserAPass(Map paramMap);
	
}
