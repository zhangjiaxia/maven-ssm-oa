package org.pan.interceptor;  
  
import org.aopalliance.intercept.MethodInterceptor;  
import org.aopalliance.intercept.MethodInvocation;  
import org.pan.bean.User;  
  
public class TestAuthorityInterceptor implements MethodInterceptor{  
  
    /*private User user;  
    public void setUser(User user) {  
        this.user = user;  
    }  */
    @Override  
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {  
        /*String methodName=methodInvocation.getMethod().getName();  
        System.out.println("method="+methodName+",username="+user.getUserName());
        if(user.getUserName().equals("unRegisterUser")){  
            System.out.println("你现在还没有登陆，没有权限回复帖子，删除帖子");  
            return null;  
        }  
        if(user.getUserName().equals("user")&&methodName.equals("deleteTopic")){  
            System.out.println("您的身份是注册用户，没有权限删除帖子");  
            return null;  
        }  
        return methodInvocation.proceed();  */
    	
    	String name = (String)methodInvocation.getArguments()[0];
        System.out.println("name="+name+"methodInvocation.getArguments().length="+methodInvocation.getArguments().length);
        if (name.equals("flash")) {
        System.out.println("这才是真正的用户！ ");
        return methodInvocation.proceed();
        } else {
        System.out.println("非法的用户~~~ ");
        return null;
        }  
    }
  
}  