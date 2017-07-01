	//题目描述
	//如果一个数字从左边读和从右边读一样，那么这个数字就是一个回文数。例如32123就是一个回文数；17在某种意义上也是一个回文数，因为它的二进制型式——10001——是一个回文数。
	//
	//请你帮忙开发一个程序，判断一个数n在任意进制（2-16）下是否有回文数。
	//
	//输入描述:
	//输入包含多组数据。
	//
	//每组数据包括一个正整数n (1≤n<2^31)。
	//
	//
	//输出描述:
	//对应每组数据，如果n在2-16进制下存在回文数，则输出“Yes”；否则输出“No”。
	//
	//输入例子:
	//32123
	//17
	//
	//输出例子:
	//Yes
	//Yes
package 进制回文数;

import java.util.Scanner;

public class Main {
	public static Boolean f1(int n,int r){
		int []c= new int[35];
		int count=0;
		do{
			c[count++]=n%r;
			n/=r;
		}while(n!=0);
		for(int i=0;i<count/2;i++){
			if(c[i]!=c[count-1-i]){
				return false;
			}
			
		} return true;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n=in.nextInt();
			int i=0;
			for( i=2;i<=16;i++){
				if(f1(n,i)){
					System.out.println("Yes");
					break;
				}
			}
			if(i>16){
				System.out.println("No");
			}
			
			
		}
		
	}

}
