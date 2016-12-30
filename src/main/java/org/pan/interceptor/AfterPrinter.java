package org.pan.interceptor;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterPrinter implements AfterReturningAdvice{
	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("add log:print Hello world");
	}	
}
