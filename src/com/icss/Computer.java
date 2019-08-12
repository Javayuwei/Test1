package com.icss;

public class Computer {
	//电脑状态 0--正常   1--蓝屏   2--冒烟
	int status =1;
	public void run() throws LanPingException{
		//发生蓝屏事件
		if (status==1) {
			//抛出异常
			throw new LanPingException("蓝屏事件发生了。。。");
			
		}
		System.out.println("电脑启动啦。。，");
		
	}
	public void restart(){
		status =0;
	}
}
