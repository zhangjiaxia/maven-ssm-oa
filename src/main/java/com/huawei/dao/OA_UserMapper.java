package com.huawei.dao;

import java.util.List;

import com.huawei.model.OA_Task;
import com.huawei.model.OA_User;

public interface OA_UserMapper {
	/**
	 * 用户与任务的多对多关联
	 * @return
	 */
	List<OA_User> getOA_Users();
	
	List<OA_Task> getOA_Tasks();
	
    int deleteByPrimaryKey(Integer userId);

    int insert(OA_User record);

    int insertSelective(OA_User record);

    OA_User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(OA_User record);

    int updateByPrimaryKey(OA_User record);
}