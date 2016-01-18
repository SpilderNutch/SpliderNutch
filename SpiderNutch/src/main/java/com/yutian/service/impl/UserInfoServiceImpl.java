package com.yutian.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yutian.mapper.UserInfoMapper;
import com.yutian.model.UserInfo;
import com.yutian.service.UserInfoService;

@Service(value="userInfoService")
public class UserInfoServiceImpl implements UserInfoService{

	@Resource(name="userInfoMapper")
	private UserInfoMapper userInfoMapper;

	public UserInfo getUserInfoById(String id) {
		return userInfoMapper.getUserInfoById(id);
	}


}
