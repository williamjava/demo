package com.tu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tu.entity.UserInfo;
import com.tu.service.user.UserInfoService;

@Controller
@RequestMapping("/user")
public class UserController{
	@Autowired
	private UserInfoService userInfoService;
	
	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}

	@RequestMapping("/getAllUsers")
	public ModelAndView getAllUsers(ModelMap model) {
		List<UserInfo> userList = userInfoService.queryUserInfoList(null);
		model.addAttribute("userList", userList);
		
        return new ModelAndView("userList");
	}
	
}
