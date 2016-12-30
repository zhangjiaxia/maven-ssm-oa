package com.huawei.controller;

import java.util.List;

import org.pan.bean.dao.TestCommunity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huawei.model.User;
import com.huawei.service.IUserService;

@Controller
@RequestMapping("/userController")
public class UserController {
	private IUserService userService;

	public IUserService getUserService() {
		return userService;
	}
	@Autowired
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/showUsers")
    public String showUsers(Model model){
		User u = new User();
		u.setUsername("张三");
		u.setMobile("342w4436");
		userService.insert(u);
		List<User> list = userService.queryAll();
		model.addAttribute("list", list);
		return "index";
	}
	
}
