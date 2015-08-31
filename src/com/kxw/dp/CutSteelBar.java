package com.kxw.dp;

import com.kxw.util.ArrayUtil;

/**
 * 切割钢条问题
 * @author kangxiongwei
 * @date 2015年8月24日
 */
public class CutSteelBar {

	public static void main(String[] args) {
		Integer[] price = {0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30};  
		Integer[] result = dpBottomToUpRod(price,10);
		ArrayUtil.printArray(result);
	}

	/**
	 * 测试1
	 */
	public static void test01() {
		Integer[] price = {0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30};  
		int result = recursion(price, 8);
		System.out.println(result);
	}
	/**
	 * 使用递归求解
	 * 当n输入较大时，会递归反复调用，运行速度很慢
	 * @param price
	 * @param n
	 * @return
	 */
	public static int recursion(Integer[] price,int n){
		if(n == 0) return 0;
		int q = Integer.MIN_VALUE;
		for(int i = 1; i <= n; i++){
			q = Math.max(q,price[i]+recursion(price, n-i));
		}
		return q;
	}
	
	/**
	 * 动态规划解法，自底向上
	 * @param price
	 * @param n
	 */
	public static Integer[] dpBottomToUpRod(Integer[] price,int n){
		Integer[] result = new Integer[n+1];
		result[0] = 0;
		for(int j=1; j<=n; j++){
			int q = Integer.MIN_VALUE;
			for(int i=1; i<=j; i++){
				q = Math.max(q, price[i]+result[j-i]);
			}
			result[j] = q;
		}
		return result;
	}
	
}
