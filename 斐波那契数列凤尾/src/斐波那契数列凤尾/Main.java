package 斐波那契数列凤尾;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] c= new long[100000+5];
		c[1]=1;
		c[2]=2;
		for(int i=3;i<100000+3;i++){
			c[i]=(c[i-1]+c[i-2])%1000000;
		}
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextInt()){
			int n=in.nextInt();
			System.out.printf(n<25?"%d\n":"%06d\n", c[n]);
			
			
		}
	}

}
