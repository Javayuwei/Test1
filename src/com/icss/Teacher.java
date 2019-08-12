package com.icss;

public class Teacher {
	Computer c;
	public Teacher(){
		c=new Computer();
	}
	//讲课
	void jk() {
		try {
			c.run();
			System.out.println("开始上课。。。");
		} catch (LanPingException e) {
			System.out.println(e.getMessage());
			//重启
			c.restart();
	    //继续上课
			jk();
		}
		
	}
}
