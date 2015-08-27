package com.kxw.util;

/**
 * 对数组的处理帮助类
 * @author kangxiongwei
 * @date 2015年8月26日
 */
public class ArrayUtil {
	
	/**
	 * 打印数组到控制台
	 * @param objs
	 */
	public static void printArray(Object[] objs){
		for(int i=0; i<objs.length; i++){
			System.out.print(objs[i]+" ");
		}
		System.out.println();
	}
	
	
}
