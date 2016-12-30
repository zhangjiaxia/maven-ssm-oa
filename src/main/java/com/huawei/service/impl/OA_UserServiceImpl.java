package com.huawei.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huawei.dao.OA_UserMapper;
import com.huawei.model.OA_Task;
import com.huawei.model.OA_User;
import com.huawei.service.IOA_UserService;

@Service("oa_userService")
public class OA_UserServiceImpl implements IOA_UserService {

	private OA_UserMapper oa_userMapper;
	
	public OA_UserMapper getOa_userMapper() {
		return oa_userMapper;
	}
	
	@Autowired
	public void setOa_userMapper(OA_UserMapper oa_userMapper) {
		this.oa_userMapper = oa_userMapper;
	}

	@Override
	public List<OA_User> getOA_Users() {
		return oa_userMapper.getOA_Users();
	}
	
	@Override
	public List<OA_Task> getOA_Tasks() {
		return oa_userMapper.getOA_Tasks();
	}
	
	@Override
	public int deleteByPrimaryKey(Integer userId) {
		return oa_userMapper.deleteByPrimaryKey(userId);
	}

	@Override
	public int insert(OA_User record) {
		return oa_userMapper.insert(record);
	}

	@Override
	public int insertSelective(OA_User record) {
		return oa_userMapper.insertSelective(record);
	}

	@Override
	public OA_User selectByPrimaryKey(Integer userId) {
		return oa_userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public int updateByPrimaryKeySelective(OA_User record) {
		return oa_userMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(OA_User record) {
		return oa_userMapper.updateByPrimaryKey(record);
	}

}
