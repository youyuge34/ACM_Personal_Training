package 打印沙漏;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		char x=in.next().charAt(0);
		if(n==1){
			System.out.println(x);
			System.out.println(0);
		}else{
		int s=0;
		int i=0;
		for( i=1;s<=n;i+=2){
			if(i==1){
				s+=1;
			}else{
				s+=2*i;
			}
		}int m=n-(s-2*(i-2));
		i-=4;
		int i1=i;
		String c[]=new String[100];
		for(int j=0;j<(i+1)/2;j++){
			c[j]="";
			for(int l=0;l<j;l++){
				c[j]+=" ";
			}
			for(int l=0;l<i1;l++){
				c[j]+=x;
			}
			i1-=2;
		}
		for(int j=0;j<(i+1)/2;j++){
			System.out.println(c[j]);
		}
		for(int j=(i+1)/2-2;j>=0;j--){
			System.out.println(c[j]);
		}
		
		System.out.println(m);
		}
	}
}
