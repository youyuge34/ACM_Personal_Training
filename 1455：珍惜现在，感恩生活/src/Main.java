import java.util.Scanner;

/**
 * 题目描述：
 * 为了挽救灾区同胞的生命，心系灾区同胞的你准备自己采购一些粮食支援灾区，现在假设你一共有资金n元，而市场有m种大米，每种大米都是袋装产品，其价格不等，
 * 并且只能整袋购买。请问：你用有限的资金最多能采购多少公斤粮食呢？ 
 * 输入：
 * 输入数据首先包含一个正整数C，表示有C组测试用例，每组测试用例的第一行是两个整数n和m(1<=n<=100,
 * 1<=m<=100),分别表示经费的金额和大米的种类，然后是m行数据，每行包含3个数p，h和c(1<=p<=20,1<=h<=200,1<=c<=20)，
 * 分别表示每袋的价格、每袋的重量以及对应种类大米的袋数。 
 * 输出：
 * 对于每组测试数据，请输出能够购买大米的最多重量，你可以假设经费买不光所有的大米，并且经费你可以不用完。每个实例的输出占一行。 
 * 样例输入： 1 8 2 2
 * 100 4 4 100 2 
 * 样例输出： 400
 * 
 * @author yousheng
 *
 */
class Node{
	int v;
	int w;
	public Node(int v, int w) {
		super();
		this.v = v;
		this.w = w;
	}
	
}
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t--!=0){
			int s = in.nextInt();
			int n = in.nextInt();
			Node[] list = new Node[10000];
			int dp[] = new int[s+1];
			int total = 0;  //拆分后总数
			for (int i = 1; i <= n; i++) {
				int w = in.nextInt();
				int p = in.nextInt();
				int num = in.nextInt();
				int c =1;
				while(num - c>0){
					num -= c;
					list[++total] = new Node(p*c, w*c);
					
					c*=2;
				}
				list[++total] = new Node(p*num, w*num); 
			}
			
			for (int i = 1; i <= total; i++) {
				for (int j = s; j >=list[i].w; j--) {
					dp[j] = Math.max(dp[j], dp[j-list[i].w]+list[i].v);
				}
			}
			System.out.println(dp[s]);
		}
	}

}
