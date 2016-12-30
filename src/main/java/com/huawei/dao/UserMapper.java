package com.huawei.dao;

import java.util.List;

import com.huawei.model.User;

public interface UserMapper {
	List<User> queryAll();
	
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}