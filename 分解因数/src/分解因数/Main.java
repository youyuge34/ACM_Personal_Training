package 分解因数;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] a= new int[100000];
		int n=0;
		for(int i=2;i<=100000;i++){
			Boolean f=true;
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
					f=false;
					break;
				}
			}
			if(f){
				a[n++]=i;
			}
		}
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			Boolean f=true;
			int m=in.nextInt();
			System.out.print(m+" = ");
			for(int j=0;m!=1;j++){
				while(m%a[j]==0){
					if(f){
					System.out.print(a[j]);
					f=false;}else{
						System.out.print(" * "+a[j]);
					}
					m/=a[j];
				}
			}
			System.out.println();
		}
		
		
	}

}
