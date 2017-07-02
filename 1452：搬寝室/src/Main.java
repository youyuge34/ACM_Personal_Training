import java.util.Arrays;
import java.util.Scanner;

/**
 * 题目描述：
 * 搬寝室是很累的,xhd深有体会.时间追述2006年7月9号,那天xhd迫于无奈要从27号楼搬到3号楼,因为10号要封楼了.看着寝室里的n件物品,
 * xhd开始发呆,因为n是一个小于2000的整数,实在是太多了,于是xhd决定随便搬2*k件过去就行了.但还是会很累,因为2*k也不小是一个不大于n的整数.
 * 幸运的是xhd根据多年的搬东西的经验发现每搬一次的疲劳度是和左右手的物品的重量差的平方成正比(这里补充一句,xhd每次搬两件东西,左手一件右手一件).
 * 例如xhd左手拿重量为3的物品,右手拿重量为6的物品,则他搬完这次的疲劳度为(6-3)^2 =
 * 9.现在可怜的xhd希望知道搬完这2*k件物品后的最佳状态是怎样的(也就是最低的疲劳度),请告诉他吧。 
 * 
 * 输入：
 * 每组输入数据有两行,第一行有两个数n,k(2<=2*k<=n<2000).第二行有n个整数分别表示n件物品的重量(重量是一个小于2^15的正整数).
 * 输出： 对应每组输入数据,输出数据只有一个表示他的最少的疲劳度,每个一行. 
 * 样例输入： 2 1 
 * 			1 3 
 * 样例输出： 4
 * 
 * @author yousheng
 * 
 */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int k = in.nextInt();
			int[] list = new int[n];
			for (int i = 0; i < list.length; i++) {
				list[i] = in.nextInt();
			}
			
			Arrays.sort(list);
			int dp[][] = new int[k+1][n+1];
			for (int i = 0; i <= n; i++) {
				dp[0][i] = 0;
			}
			for (int i = 1; i < dp.length; i++) {
				for (int j = 2*i; j < dp[0].length; j++) {
					if(j==2*i){
						//必须添加最后一对,不能由dp[i][j-1]状态转移而来
						dp[i][j] = (int) (dp[i-1][j-2]+Math.pow((list[j-1]-list[j-2]),2));
					}
					else {
						dp[i][j] = Math.min(dp[i][j-1],(int) (dp[i-1][j-2]+Math.pow((list[j-1]-list[j-2]),2)));
					}
				}
			}
			System.out.println(dp[k][n]);
		}
	}

}
