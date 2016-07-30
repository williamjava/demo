package com.tu.mapper;

import java.util.List;

import javax.annotation.Resource;

import com.tu.entity.UserInfo;

@Resource
public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);
    
    List<UserInfo> selectAllUsers(UserInfo record);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}