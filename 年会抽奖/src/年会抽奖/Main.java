package 年会抽奖;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		long c[]=new long[22];
		c[2]=1;
		c[3]=2;
		for(int i=4;i<c.length;i++){
			c[i]=(i-1)*(c[i-1]+c[i-2]);
		}
		while(in.hasNext()){
			int n=in.nextInt();
			long mul=1;
			for(int i=1;i<=n;i++){
				mul*=i;
			}
			System.out.printf("%2.2f",(double)c[n]/mul*100);
			System.out.print("%\n");
		}

	}

}
