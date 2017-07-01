package 数组元素循环右移问题;

import java.util.Scanner;

public class Main {
	public static void main(String arg[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt()%n;
		int[] c=new int[1000];
		int[] s=new int[101];
		for(int i=0;i<n;i++){
			c[i]=in.nextInt();
		}
		int k=0;
		for(int i=n-m;i<n;i++){
			s[k++]=c[i];
		}
		for(int i=0;i<n-m;i++){
			s[k++]=c[i];
		}
		Boolean f=true;
		for(int i=0;i<k;i++){
			if(f){
				System.out.print(s[i]);
				f=false;
			}else{
				System.out.print(" "+s[i]);
			}
		}
	}
}
