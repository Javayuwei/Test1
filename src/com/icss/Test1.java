package com.icss;

public class Test1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int a;
		try {
			a = m1(arr, -3);
			System.out.println(a);
			
			
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
			
		} 
		

	}

	private static int m1(int[] arr, int i) throws FuShuException {
		if ( arr==null) {
			throw new NullPointerException("空指针异常发生了");
			
		}
		if (i >= arr.length) {
			// 抛出异常
			throw new ArrayIndexOutOfBoundsException("数组下标越界异常发生了");
		}
		
		if (i<0) {
			throw new FuShuException("下标为负数了");
			
		}
		return arr[i];
	}
	

}
