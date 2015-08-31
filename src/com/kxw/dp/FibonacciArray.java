package com.kxw.dp;

/**
 * 使用动态规划来计算斐波那契数列的第n个值
 * @author kangxiongwei
 * @date 2015年8月31日
 */
public class FibonacciArray {

	public static void main(String[] args) {
		//System.out.println(commonAlgorithms(10));
		System.out.println(dpAlgorithms(10));
	}
	
	/**
	 * 普通递归解法
	 * @param n
	 * @return
	 */
	public static int commonAlgorithms(int n){
		if(n == 0 || n == 1) return 1;
		return commonAlgorithms(n-1)+commonAlgorithms(n-2);
	}
	
	/**
	 * 使用动态规划求解
	 * 时间复杂度O(n)，效率高
	 * @param n
	 * @return
	 */
	public static int dpAlgorithms(int n){
		Integer[] array = new Integer[n+1];
		array[0] = array[1] = 1;
		for(int i=2; i<=n; i++){
			array[i] = array[i-1]+array[i-2];
		}
		return array[n];
	}
	
}
