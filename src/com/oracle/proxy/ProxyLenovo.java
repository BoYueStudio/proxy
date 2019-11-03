package com.oracle.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyLenovo {

	public static void main(String[] args) {
		//��̬����lenovo
		Computer computer=(Computer)Proxy.newProxyInstance(Lenovo.class.getClassLoader(), Lenovo.class.getInterfaces(),new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO Auto-generated method stub
				if(method.getName().contains("startWatch")){
					System.out.println("����Ƶ��������");
				}
				
				Class clazz=Lenovo.class;
				Object obj=clazz.newInstance();
				Object result=method.invoke(obj, args);
				
				if(method.getName().contains("stopWatch")){
					System.out.println("�ر���Ƶ������!");
				}
				
				return result;
			}
		});
		
		//computer.startWatch("87654");
		computer.stopWatch("�װ��ģ��Ȱ���");
		
		
	}

}
