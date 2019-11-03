package com.oracle.proxy;

public  class Lenovo  implements Computer{

	@Override
	public void startWatch(String movie) {
		System.out.println("开始观看："+movie);
		
	}

	@Override
	public void stopWatch(String movie) {
		System.out.println("停止观看："+movie);
		
	}

	

}
