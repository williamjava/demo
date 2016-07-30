package com.tu.service.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tu.dao.user.UserInfoDao;
import com.tu.entity.UserInfo;
import com.tu.service.user.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	private UserInfoDao userInfoDao;
	
	public void setUserInfoDao(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}

	@Override
	public List<UserInfo> queryUserInfoList(UserInfo userInfo) {
		return userInfoDao.getAllUserInfos(userInfo);
	}

}
