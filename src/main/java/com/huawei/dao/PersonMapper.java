package com.huawei.dao;

import java.util.List;

import com.huawei.model.Person;

public interface PersonMapper {
    /**
     * ����һ����¼
     * @param person
     * @return 
     */
    boolean insert(Person person);
    
    /**
     * ��ѯ����
     * @return
     */
    List<Person> queryAll();
}