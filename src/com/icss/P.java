package com.icss;


	public class P {
		int i = 10;
		public void change(int i) {
			this.i = i;
		}
		public void print() {
			System.out.println(this.i);
		}	
		public static void main(String[] args) {
			P p=new C();
			p.i=50;
			p.change(15);
			System.out.println(p.i);
			p.print();
		}
	}
	class C extends P {
		int i = 20;
		public void print() {
			System.out.println(this.i);
		}


}
