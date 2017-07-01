package 一的个数;

import java.util.Scanner;

public class Main {
	public static void f1(int n,int r){
		int count=0;
		do{
			if(n%r==1){
				count++;
			}
			n/=r;
		}while(n!=0);
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		while(in.hasNext()){
			int n=in.nextInt();
			int r=in.nextInt();
			
			f1(n,r);
		}
		
	}

}
