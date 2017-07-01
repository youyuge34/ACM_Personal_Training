package 程序运行时间;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		long a=in.nextLong();
		long b=in.nextLong();
		
		long c=Math.round((b-a)/100.0);
		int a1=(int) (c/3600);
		int a2=(int) (c%3600/60);
		int a3=(int) (c%60);
		System.out.printf("%02d:%02d:%02d",a1,a2,a3);
	}

}
