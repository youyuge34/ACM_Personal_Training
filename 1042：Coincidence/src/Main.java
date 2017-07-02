import java.util.Scanner;

/**
 * 题目描述： Find a longest common subsequence of two strings. 
 * 输入： First and second
 * line of each input case contain two strings of lowercase character a…z. There
 * are no spaces before, inside or after the strings. Lengths of strings do not
 * exceed 100. 
 * 输出： For each case, output k – the length of a longest common
 * subsequence in one line. 
 * 样例输入： abcd cxbydz 
 * 样例输出： 2
 */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String a = in.next();
			String b = in.next();
			int[][] dp = new int[a.length()+1][b.length()+1];
			for(int i=0;i<dp.length;i++){
				dp[i][0] = 0;
			}
			for(int i=0;i<dp[0].length;i++){
				dp[0][i] = 0;
			}
			
			for (int i = 1; i < dp.length; i++) {
				for (int j = 1; j < dp[0].length; j++) {
					if(a.charAt(i-1)==b.charAt(j-1)){
						dp[i][j] = dp[i-1][j-1]+1;
					}else{
						dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
					}
				}
			}
//			for (int i = 1; i < dp.length; i++) {
//				for (int j = 1; j < dp[0].length; j++) {
//					System.out.print(dp[i][j]+" ");
//				}
//				System.out.println();
//			}
			System.out.println(dp[a.length()][b.length()]);
			
			
			
		}
	}

}
