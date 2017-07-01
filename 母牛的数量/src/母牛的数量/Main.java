package 母牛的数量;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] c=new int[100];
		Scanner in =new Scanner(System.in);
		for(int i=5;i<60;i++){
			c[1]=1;
			c[2]=2;
			c[3]=3;
			c[4]=4;
			c[i]=c[i-1]+c[i-3];
		}
		while(in.hasNextInt()){
			System.out.println(c[in.nextInt()]);
		}
	}

}
