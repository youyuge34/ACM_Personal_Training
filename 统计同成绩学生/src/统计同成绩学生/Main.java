package 统计同成绩学生;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[105];
		for(int i=0;i<a.length;i++){
			a[i]=0;
		}
		for(int i=0;i<n;i++){
			a[in.nextInt()]++;
		}
		int k=in.nextInt();
		for(int i=0;i<k;i++){
			System.out.print(i==0?a[in.nextInt()]:" "+a[in.nextInt()]);
		}
	}

}
