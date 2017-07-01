package 跟奥巴马学编程;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		char c=in.next().charAt(0);
		for(int i=0;i<n;i++){
			System.out.print(c);
		}
		System.out.println();
		for(int i=0;i<Math.round(n/2.0)-2;i++){
			System.out.print(c);
			for(int j=0;j<n-2;j++){
				System.out.print(" ");
			}
			System.out.println(c);
		}
		for(int i=0;i<n;i++){
			System.out.print(c);
		}
	}

}
