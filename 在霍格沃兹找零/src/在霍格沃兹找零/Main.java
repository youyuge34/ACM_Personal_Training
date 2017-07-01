package 在霍格沃兹找零;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s1[]=in.next().split("\\.");
		String s2[]=in.next().split("\\.");
		int a[]=new int[3];
		int b[]=new int[3];
		int c[]=new int[3];
		Boolean shi=false;
		Boolean bai=false;
		for(int i=0;i<3;i++){
			a[i]=Integer.valueOf(s1[i]);
			b[i]=Integer.valueOf(s2[i]);
		}
		Boolean f=true;
		if(a[0]>b[0]){
			f=false;
		}else if(a[0]==b[0]&&a[1]>b[1]){
			f=false;
		}else if(a[0]==b[0]&&a[1]==b[1]&&a[2]>b[2]){
			f=false;
		}
		
		if(f){
		if(b[2]-a[2]<0){
		    c[2]=b[2]-a[2]+29;
		    b[1]-=1;
		}else{c[2]=b[2]-a[2];}
		
		if(b[1]<a[1]){
			c[1]=b[1]-a[1]+17;
			b[0]-=1;
		}else{c[1]=b[1]-a[1];}
		
			c[0]=b[0]-a[0];
			System.out.println(c[0]+"."+c[1]+"."+c[2]);
		}else{
			int a1[]=a;
			int b1[]=b;
			a=b1;
			b=a1;
			if(b[2]-a[2]<0){
			    c[2]=b[2]-a[2]+29;
			    b[1]-=1;
			}else{c[2]=b[2]-a[2];}
			
			if(b[1]<a[1]){
				c[1]=b[1]-a[1]+17;
				b[0]-=1;
			}else{c[1]=b[1]-a[1];}
			
				c[0]=b[0]-a[0];
				System.out.println("-"+c[0]+"."+c[1]+"."+c[2]);
			
			
			
		}
		
	}

}
