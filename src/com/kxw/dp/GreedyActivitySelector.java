package com.kxw.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * 贪心算法
 * @author kangxiongwei
 * @date 2015年9月8日
 */
public class GreedyActivitySelector {

	private static List<Integer> values = new ArrayList<Integer>();
	
	//使用递归实现
	public static void recursiveActivitySelector(int[] s,int[] f,int k,int n){
		int m = k+1;
		while(m<=n && s[m]<f[k]){
			m = m+1;
		}
		if(m <= n){
			values.add(m);
			recursiveActivitySelector(s, f, m, n);
		}
	}
	//使用循环实现
	public static List<Integer> greedyActivitySelector(int[] s,int[] f){
		int n = s.length;
		List<Integer> list = new ArrayList<Integer>();
		//以第一个元素作为贪心依据
		list.add(1);
		int k = 1;
		for(int m=2; m<n; m++){
			if(s[m] >= f[k]){
				list.add(m);
				k = m;
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		//贪心算法前提，f是从小到大排列的
		int[] s = {0,1,3,0,5,3,5,6,8,8,2,12};
		int[] f = {0,4,5,6,7,9,9,10,11,12,14,16};
		//recursiveActivitySelector(s, f, 0, s.length-1);
		List<Integer> result = greedyActivitySelector(s, f);
		System.out.println(result);
	}
	
}
