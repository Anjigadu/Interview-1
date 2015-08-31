package com.kxw.dp;

import com.kxw.util.ArrayUtil;

/**
 * 计算n的阶乘
 * @author kangxiongwei
 * @date 2015年8月31日
 */
public class FactorialOfN {

	public static void main(String[] args) {
		int result = factorial(5);
		System.out.println(result);
	}
	
	public static int factorial(int n){
		Integer[] array = new Integer[n+1];
		array[1] = array[0] = 1;
		for(int i=2; i<=n; i++){
			array[i] = array[i-1]*i;
		}
		ArrayUtil.printArray(array);
		return array[n];
	}
	
}
