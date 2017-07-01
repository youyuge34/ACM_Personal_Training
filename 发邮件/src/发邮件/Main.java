package 发邮件;

import java.util.Scanner;

//用的是单步最优的考虑想法，从最后一步开始考虑。
//为了方便理解，假设有5个人ABCDE，原来只有4个人ABCD。则多出来的一个人E，
//多出来的邮件E必定发错给ABCD中一个，共四种方法。假设给E的邮件发给了D，则
//  人 ：   A  B  C  D  E
// 邮件：            E
//则发给D的邮件D有两种情况：一是正好发给了人E，二是发给了E以外的人（ABC）
//若情况一：变成了3人各自错收了邮件。
//若情况二：由于D不能发给E，我们可以假象D就是E（和原来等价），则此时变成了ABCE错发给ABCE，就等价于4人错收邮件。
//这样就很明白了，f（n）=（n-1）*[f（n-2）+f（n-1）]
public class Main {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		long c[]=new long[22];
		c[2]=1;
		c[3]=2;
		for(int i=4;i<22;i++){
			c[i]=(i-1)*(c[i-1]+c[i-2]);
		}
		while(in.hasNext()){
			int n=in.nextInt();
			System.out.println(c[n]);
		}
		
	}

}
