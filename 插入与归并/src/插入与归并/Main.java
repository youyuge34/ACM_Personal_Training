package 插入与归并;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for (int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		for (int i=0;i<n;i++){
			b[i]=in.nextInt();
		}
		
		Boolean f=false;
		int index=0;
		while(b[index+1]>=b[index]){
			index++;
		}
		for(int j=index+1;j<n;j++){
			if(a[j]!=b[j]){
				f=true;
				break;
			}
		}
		
		if(!f){
			System.out.println("Insertion Sort");
			int j=index;
			int i=b[index+1];
			while(j>=0&&b[j]>i){
				b[j+1]=b[j];
				j--;
			}
				b[j+1]=i;
				
		}else{
			System.out.println("Merge Sort");
			index=(index+1)*2;
			int k=0;
			for(;k+index<n;k+=index){
				Arrays.sort(b,k,k+index);
			}
			Arrays.sort(b,k,n);
			
		}
		for(int k=0;k<n;k++){
			System.out.print(k==0?b[0]:" "+b[k]);
		}
	}

}
