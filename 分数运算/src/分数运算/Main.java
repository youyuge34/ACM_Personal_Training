package 分数运算;

import java.util.Scanner;

public class Main {
	public static int gcd(int m,int n){
		int t;
		if(m<n){
			t=n;
			n=m;
			m=t;
		}
		while(m%n>0){
			t=m%n;
			m=n;
			n=t;
		}
		return n;
	}
	
	public static void s(int a,int b){
		if(a*b<0){
			System.out.print("-");
		}
		int n=gcd(Math.abs(a),Math.abs(b));
		System.out.println(a/n+"/"+b/n);
		
	}
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			while(in.hasNextLine()){
				String[] a=in.next().split("/");
				String[] b=in.next().split("/");
				String c=in.next();

				int[] m=new int[2];
				int[] n=new int[2];
				m[0]=Integer.parseInt(a[0]);
				m[1]=Integer.parseInt(a[1]);
				n[0]=Integer.parseInt(b[0]);
				n[1]=Integer.parseInt(b[1]);
				
				if(c.equals("+")){
					s(m[0]*n[1]+m[1]*n[0],m[1]*n[1]);
				}
				if(c.equals("-")){
					s(m[0]*n[1]-m[1]*n[0],m[1]*n[1]);
				}
				if(c.equals("*")){
					s(m[0]*n[0],m[1]*n[1]);
				}
				if(c.equals("/")){
					s(m[0]*n[1],m[1]*n[0]);
				}
			}
		
	}

}
