package com.oracle.proxy;

public  class Lenovo  implements Computer{

	@Override
	public void startWatch(String movie) {
		System.out.println("��ʼ�ۿ���"+movie);
		
	}

	@Override
	public void stopWatch(String movie) {
		System.out.println("ֹͣ�ۿ���"+movie);
		
	}

	

}
