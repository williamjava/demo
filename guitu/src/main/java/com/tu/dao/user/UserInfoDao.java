package com.tu.dao.user;

import java.util.List;

import com.tu.entity.UserInfo;

public interface UserInfoDao {
	List<UserInfo> getAllUserInfos(UserInfo userInfo);
}
