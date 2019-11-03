package com.oracle.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyLenovo {

	public static void main(String[] args) {
		//动态代理lenovo
		Computer computer=(Computer)Proxy.newProxyInstance(Lenovo.class.getClassLoader(), Lenovo.class.getInterfaces(),new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO Auto-generated method stub
				if(method.getName().contains("startWatch")){
					System.out.println("打开视频播放器！");
				}
				
				Class clazz=Lenovo.class;
				Object obj=clazz.newInstance();
				Object result=method.invoke(obj, args);
				
				if(method.getName().contains("stopWatch")){
					System.out.println("关闭视频播放器!");
				}
				
				return result;
			}
		});
		
		//computer.startWatch("87654");
		computer.stopWatch("亲爱的，热爱的");
		
		
	}

}
