package com.lulf.sjms;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ZJ implements InvocationHandler{
	private ZFZ target;
	
	//��ȡ�������˵Ķ���
	@SuppressWarnings("rawtypes")
	public Object getInstance(ZFZ target){
		this.target=target;
		Class zz=target.getClass();
		return Proxy.newProxyInstance(zz.getClassLoader(), zz.getInterfaces(),this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("�����н� CQ");
		method.invoke(target, args);
		return null;
	}
}
