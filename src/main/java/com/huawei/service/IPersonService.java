package com.huawei.service;

import java.util.List;

import com.huawei.model.Person;

public interface IPersonService {

    /**
     * ����ȫ����person
     * @return
     */
    List<Person> loadPersons();
    boolean insertPerson(Person person);
    
}