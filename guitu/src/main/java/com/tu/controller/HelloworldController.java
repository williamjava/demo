package com.tu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class HelloworldController{
	
	@RequestMapping("/hello")
	public ModelAndView sayHello(ModelMap model) {
		//String username = RedisUtil.getJedisInstance().get("myname");
		model.addAttribute("message", "Hello World, I'm William.");
		
        return new ModelAndView("hello");
	}
	
	
	@RequestMapping("/change")
	public ModelAndView changeName(ModelMap model,@RequestParam("name") String name) {
		//RedisUtil.getJedisInstance().set("myname", name);
		
		//String username = RedisUtil.getJedisInstance().get("myname");
		model.addAttribute("message", "Hello World, I'm William.");
		
        return new ModelAndView("hello");
	}
}
