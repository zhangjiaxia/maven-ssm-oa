package com.huawei.controller;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huawei.model.OA_Task;
import com.huawei.service.IOA_TaskService;
import com.huawei.util.DateUtil;

@Controller
@RequestMapping("/oa_taskController")
public class OA_TaskController{
	private IOA_TaskService oa_taskService;
	
	public IOA_TaskService getOa_taskService() {
		return oa_taskService;
	}
	@Autowired
	public void setOa_taskService(IOA_TaskService oa_taskService) {
		this.oa_taskService = oa_taskService;
	}

	@RequestMapping("/showOA_Task")
    public String showOA_Task(Model model) throws ParseException{
		Date limit = DateUtil.parse("1996-12-15 12:00:02");
		OA_Task oa_task = new OA_Task();
		oa_task.setTaskContent("去整理报告并打印出来");
		oa_task.setTaskLimit(limit);
		oa_task.setTaskTime(new Date());
		oa_task.setTaskFromuser(1);
		oa_taskService.insert(oa_task);
		OA_Task oa_task2 = oa_taskService.selectByPrimaryKey(1);
		model.addAttribute("oa_task2", oa_task2);
		return "oa_task";
	}
	
	@RequestMapping("/add_relation")
    public String add_relation(Model model) throws ParseException{
		Map<String,Integer> map=new HashMap<String,Integer>(); 
		map.put("taskId",1);
		map.put("userId",2); 
		oa_taskService.relation(map);
		System.out.println("执行成功");
		return "oa_task";
	}
}
