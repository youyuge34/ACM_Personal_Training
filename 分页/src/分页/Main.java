package 分页;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("请B14111818尤晟输入分页大小kb:");
		int size=in.nextInt();
		System.out.println("请B14111818尤晟输入分页数：");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("请B14111818尤晟输入对应主存中的页块号,空格分割：");
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		System.out.println("请B14111818尤晟输入想转换的逻辑地址个数：");
		int m=in.nextInt();
		for(int i=1;i<=m;i++){
			System.out.println("第"+i+"个逻辑地址是：");
			int l=in.nextInt();
			while((l/size)>=n){
				System.out.println("B14111818尤晟输入错误，产生越界中断！请重输：");
				l=in.nextInt();
			}
			int out=a[l/size]*size+l%size;
			System.out.println(l+"的物理地址是"+out);
		}
		
		
	}

}
