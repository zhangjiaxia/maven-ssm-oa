package org.pan.bean.dao.impl;

import org.pan.bean.dao.TestCommunity;

public class TestCommunityImpl implements TestCommunity{  
  
    @Override  
    public void answerTopic(String name) {  
        System.out.println("可以发表，回复帖子");  
          
    }  
  
    @Override  
    public void deleteTopic() {  
        System.out.println("可以删除帖子");  
          
    }  
  
}  