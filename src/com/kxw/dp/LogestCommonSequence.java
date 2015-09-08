package com.kxw.dp;

/**
 * 最长公共子序列(LCS)问题
 * @author kangxiongwei
 * @date 2015年9月8日
 */
public class LogestCommonSequence {

	public static void main(String[] args) {
		//char[] x = " ABCBDAB".toCharArray();
		//char[] y = " BDCABA".toCharArray();
		String m = "ABCBDAB";
		String n = "BDCABA";
		/*char[][] b = lcsLength(x, y);
		printLcs(b, x, x.length-1, y.length-1);*/
		char[][] b = lcsLength(m, n);
		printLcs(b, m.toCharArray(), m.length()-1,n.length()-1);
	}
	
	
	public static char[][] lcsLength(String x,String y){
		
		int m = x.length();
		int n = y.length();
		
		//System.out.println("m: "+m+",n: "+n);
		
		int c[][] = new int[m+1][n+1];
		char b[][] = new char[m][n];
		
		//让c的第一列都为0，其实不设也可以，默认数组值全是0
		/*for(int i=1; i<m+1; i++) {
			c[i][0] = 0;
		}
		for(int j=0; j<n+1; j++) {
			c[0][j] = 0;
		}*/
		
		for(int i=1; i<m+1; i++){
			for(int j=1; j<n+1; j++){
				if(x.charAt(i-1) == y.charAt(j-1)){
					c[i][j] = c[i-1][j-1]+1;
					b[i-1][j-1] = '↖';
				}
				else if(c[i-1][j] >= c[i][j-1]) {
					c[i][j] = c[i-1][j];
					b[i-1][j-1] = '↑';
				}
				else {
					c[i][j] = c[i][j-1];
					b[i-1][j-1] = '←';
				}
			}
		}
		
		return b;
		/*for(int i=0; i<m+1; i++){
			for(int j=0; j<n+1; j++){
				if(i >= 1 && j >= 1){
					System.out.print(c[i][j]);
					System.out.print(b[i-1][j-1]+" ");
				} 
				else {
					System.out.print(c[i][j]+" ");
				}
			}
			System.out.println();
		}*/
	}
	
	/**
	 * @param x
	 * @param y
	 */
	public static char[][] lcsLength(char[] x,char[] y) {
		int m = x.length;
		int n = y.length;
		
		int c[][] = new int[m][n];
		char b[][] = new char[m][n];
		
		for(int i=1; i<m; i++){
			c[i][0] = 0;
		}
		for(int j=0; j<n; j++){
			c[0][j] = 0;
		}
		for(int i=1; i<m; i++){
			for(int j=1; j<n; j++){
				if(x[i] == y[j]) {
					c[i][j] = c[i-1][j-1]+1;
					b[i][j] = '↖';
				}
				else if(c[i-1][j] >= c[i][j-1]) {
					c[i][j] = c[i-1][j];
					b[i][j] = '↑';
				}
				else {
					c[i][j] = c[i][j-1];
					b[i][j] = '←';
				}
			}
		}
		
		return b;
		
	}
	
	private static void printLcs(char[][] b,char[] x,int i,int j){
		if(i == 0 || j == 0) return;
		if(b[i][j] == '↖') {
			printLcs(b, x, i-1, j-1);
			System.out.print(x[i]+" ");
		}
		else if(b[i][j] == '↑') {
			printLcs(b, x, i-1, j);
		}
		else {
			printLcs(b, x, i, j-1);
		}
	}
	
}
