package 月饼;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int k[] =new int[n];
		int s[]=new int [n];
		for(int i=0;i<n;i++){
			k[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
			s[i]=in.nextInt();
		}
		
		double p[]=new double[n];
		for(int i=0;i<n;i++){
			p[i]=s[i]*1.0/k[i];
		}
		double temp;
		int temp1;
		for(int i=0;i<n-1;i++){
			for(int j=n-1;j>i;j--){
				if(p[j-1]<p[j]){
					temp=p[j];
					p[j]=p[j-1];
					p[j-1]=temp;
					
					temp1=k[j];
					k[j]=k[j-1];
					k[j-1]=temp1;
					
					temp1=s[j];
					s[j]=s[j-1];
					s[j-1]=temp1;
				}
			}
		}

		int now=0;
		temp=0;
		int w;
		for( w=0;now+k[w]<=m&&w<n;w++){
			temp+=s[w];
			now+=k[w];
		}
		
		temp+=(m-now)*1.0/k[w]*s[w];
		System.out.printf("%.2f",temp);
	}

}
