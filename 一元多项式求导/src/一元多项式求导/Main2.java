package 一元多项式求导;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		if(b==0){
			System.out.println("0 0");
		}else System.out.print(a*b+" "+(b-1));
		while(in.hasNextInt()){
			int m=in.nextInt();
			int n=in.nextInt();
			if(n!=0){
			System.out.print(" "+m*n+" "+(n-1));}
		}
	}

}
