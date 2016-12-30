package com.huawei.dao;

import java.util.Map;

import com.huawei.model.OA_Task;

public interface OA_TaskMapper {
	boolean relation(Map<String,Integer> map);
	
    int deleteByPrimaryKey(Integer taskId);

    int insert(OA_Task record);

    int insertSelective(OA_Task record);

    OA_Task selectByPrimaryKey(Integer taskId);

    int updateByPrimaryKeySelective(OA_Task record);

    int updateByPrimaryKey(OA_Task record);
}