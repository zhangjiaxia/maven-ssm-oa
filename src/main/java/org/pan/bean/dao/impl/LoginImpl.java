package org.pan.bean.dao.impl;

import org.pan.bean.dao.ILogin;

public class LoginImpl implements ILogin {
/**
* Login
*/
public void login(String name) {
System.out.println("欢迎 " + name + "登陆！");
}
}