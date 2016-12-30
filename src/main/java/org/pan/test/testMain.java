package org.pan.test;

import org.pan.bean.dao.TestCommunity;
import org.pan.bean.dao.impl.LoginImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testMain {
	public static void main(String[] args) {
		System.out.println("begin");
        ApplicationContext ctx = new ClassPathXmlApplicationContext(  
                "applicationContext.xml");  
        /*TestCommunity testCommunity = (TestCommunity) ctx.getBean("proxyAop");  
        testCommunity.answerTopic();   
        testCommunity.deleteTopic(); */ 
        TestCommunity login = (TestCommunity)ctx.getBean("proxyAop");
        login.answerTopic("flash"); //用户为flash是正确用户，否则是错误的
        //login.deleteTopic();
        LoginImpl loginimpl = new LoginImpl();
        loginimpl.login("张佳霞");
        System.out.println("over");
    }  
}
