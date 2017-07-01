package 蟠桃记;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long c[]=new long[32];
		c[1]=1;
		c[2]=4;
		for(int i=3;i<32;i++){
			c[i]=2*(c[i-1]+1);
		}
	
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n=in.nextInt();
			System.out.println(c[n]);
		}
	}

}
