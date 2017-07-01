package 星际密码;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long[] c= new long[10005];
		c[1]=1;
		c[2]=2;
		for(int i=3;i<=10003;i++){
			c[i]=(c[i-1]+c[i-2])%10000;
		}
		
		Scanner in =new Scanner(System.in);
		while(in.hasNextInt()){
			int n=in.nextInt();
			while(n--!=0){
				System.out.printf("%04d",c[in.nextInt()]);
			}
			System.out.println();
			
		}
		
	}

}
