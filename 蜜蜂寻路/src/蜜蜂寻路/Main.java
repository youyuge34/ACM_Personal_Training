package 蜜蜂寻路;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			long[] c=new long[1000];
			int n=in.nextInt();
			c[1]=1;c[2]=2;
			for(int i=3;i<=998;i++){
				c[i]=c[i-1]+c[i-2];
			}
			
			while(n--!=0){
				int a =in.nextInt();
				int b=in.nextInt();
				System.out.println(c[b-a]);
				
			}
	}
			
}
