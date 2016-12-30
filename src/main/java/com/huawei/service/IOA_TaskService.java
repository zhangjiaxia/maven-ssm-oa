package com.huawei.service;

import java.util.Map;

import com.huawei.model.OA_Task;

public interface IOA_TaskService {
	boolean relation(Map<String,Integer> map);
	
	int deleteByPrimaryKey(Integer taskId);

    int insert(OA_Task record);

    int insertSelective(OA_Task record);

    OA_Task selectByPrimaryKey(Integer taskId);

    int updateByPrimaryKeySelective(OA_Task record);

    int updateByPrimaryKey(OA_Task record);
}
