package com.huawei.controller;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huawei.model.OA_Task;
import com.huawei.model.OA_User;
import com.huawei.service.IOA_UserService;
import com.huawei.util.DateUtil;

@Controller
@RequestMapping("/oa_userController")
public class OA_UserController {
	private IOA_UserService oa_userService;

	public IOA_UserService getOa_userService() {
		return oa_userService;
	}
	@Autowired
	public void setOa_userService(IOA_UserService oa_userService) {
		this.oa_userService = oa_userService;
	}
	
	@RequestMapping("/showOA_User")
    public String showOA_User(Model model) throws ParseException{
		OA_User oa_user = new OA_User();
		Date birthday = DateUtil.parse2("1996-06-02");
		Date joinParty = DateUtil.parse2("2006-11-03");
		Date joinWork = DateUtil.parse2("2016-02-03");
		Date joinCompany = DateUtil.parse2("2016-11-03");
		//oa_user.setUserId("");
		oa_user.setUserAddress("广东省汕头市");
		oa_user.setUserBirth(birthday);
		oa_user.setUserDeptid(1);
		oa_user.setUserEmail("3478744229@qq.com");
		oa_user.setUserGender(0);
		oa_user.setUserGlxs("档案管理形式");
		oa_user.setUserHomeaddress("用户家庭地址");
		oa_user.setUserHomephone("潮阳谷饶");
		oa_user.setUserImgpath("图片地址");
		oa_user.setUserInsurance(1);
		oa_user.setUserInsurancetype("保险社保");
		oa_user.setUserJg("籍贯");
		oa_user.setUserJoinparty(joinParty);
		oa_user.setUserJoinwork(joinWork);
		oa_user.setUserLxr("LXR");
		oa_user.setUserJoincompany(joinCompany);
		oa_user.setUserZzmm("ZZMM");
		oa_user.setUserZy("ZY");
		oa_user.setUserXl("XL");
		oa_user.setUserStatus(1);
		oa_user.setUserSchool("硅谷");
		oa_user.setUserRole(3);
		oa_user.setUserPwd("123456");
		oa_user.setUserPhone("13005335036");
		oa_user.setUserPartyplace("PartyPlace");
		oa_user.setUserName("张佳霞");
		oa_user.setUserMz("汉族");
		oa_user.setUserMobile("手机");
		oa_user.setUserMarrige("未婚");
		oa_userService.insert(oa_user);
		OA_User oa_user2 = oa_userService.selectByPrimaryKey(1);
		model.addAttribute("oa_user2", oa_user2);
		return "oa_user";
	}
	
	@RequestMapping("/ManyToMany")
    public String ManyToMany(Model model) throws ParseException{
		List<OA_User> oa_userlist =  oa_userService.getOA_Users();
		for(OA_User u : oa_userlist)
		{
			System.out.println("user:"+u.getUserName()+","+u.getUserAddress());
			for(OA_Task t : u.getOa_tasks())
			{
				System.out.println("task:"+t.getTaskContent());
			}
		}
		model.addAttribute("username", oa_userlist.get(0).getUserName());
		model.addAttribute("taskcontent", oa_userlist.get(0).getOa_tasks().get(0).getTaskContent());
		return "index";
	}
}
