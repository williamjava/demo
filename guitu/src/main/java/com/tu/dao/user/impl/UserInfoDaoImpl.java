package com.tu.dao.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tu.dao.user.UserInfoDao;
import com.tu.entity.UserInfo;
import com.tu.mapper.UserInfoMapper;

@Repository
public class UserInfoDaoImpl implements UserInfoDao {
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	@Override
	public List<UserInfo> getAllUserInfos(UserInfo userInfo) {
		return userInfoMapper.selectAllUsers(userInfo);
	}

}
