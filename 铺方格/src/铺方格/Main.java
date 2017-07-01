package 铺方格;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in= new Scanner(System.in);
		long[] c=new long[95];
		c[1]=1;
		c[2]=2;
		for(int i=3;i<92;i++){
			c[i]=c[i-1]+c[i-2];
		}
		while(in.hasNextInt()){
			int n=in.nextInt();
			System.out.println(c[n]);
		}
	}

}
