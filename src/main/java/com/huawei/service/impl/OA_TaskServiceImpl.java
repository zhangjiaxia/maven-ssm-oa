package com.huawei.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huawei.dao.OA_TaskMapper;
import com.huawei.model.OA_Task;
import com.huawei.service.IOA_TaskService;

@Service("oa_taskService")
public class OA_TaskServiceImpl implements IOA_TaskService {

	private OA_TaskMapper oa_taskMapper;
	
	public OA_TaskMapper getOa_taskMapper() {
		return oa_taskMapper;
	}
	@Autowired
	public void setOa_taskMapper(OA_TaskMapper oa_taskMapper) {
		this.oa_taskMapper = oa_taskMapper;
	}
	
	@Override
	public boolean relation(Map<String,Integer> map)
	{
		return oa_taskMapper.relation(map);
	}
	
	@Override
	public int deleteByPrimaryKey(Integer taskId) {
		return oa_taskMapper.deleteByPrimaryKey(taskId);
	}

	@Override
	public int insert(OA_Task record) {
		return oa_taskMapper.insert(record);
	}

	@Override
	public int insertSelective(OA_Task record) {
		return oa_taskMapper.insertSelective(record);
	}

	@Override
	public OA_Task selectByPrimaryKey(Integer taskId) {		
		return oa_taskMapper.selectByPrimaryKey(taskId);
	}

	@Override
	public int updateByPrimaryKeySelective(OA_Task record) {
		return oa_taskMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(OA_Task record) {
		return oa_taskMapper.updateByPrimaryKey(record);
	}

}
