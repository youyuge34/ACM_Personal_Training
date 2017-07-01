package 数字分类;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			int n=in.nextInt();
			int c[]=new int[n+2];
			int i=0;
			int n1=n;
			while(n1-->0){
				c[i++]=in.nextInt();
			}
			in.close();
			String s="";
			int count1=0;
			for(int j=0;j<n;j++){
				if(c[j]%5==0&&c[j]%2==0){
					count1+=c[j];
				}
			}
			if(count1==0){
				s+="N";
			}else s+=count1;
			
			Boolean f1=true;
			int count2=0;
			int q=1;
			for(int j=0;j<n;j++){
				if(c[j]%5==1){
					f1=false;
					count2+=q*c[j];
					q*=-1;
				}
			}
			if(f1){
				s+=" N";
			}else s+=" "+count2;
			
			int f2=0;
			for(int j=0;j<n;j++){
				if(c[j]%5==2){
					f2++;
				}
			}
			if(f2==0){
				s+=" N";
			}else s+=" "+f2;
			
			double f3=0;
			int f4=0;
			for(int j=0;j<n;j++){
				if(c[j]%5==3){
					f3+=c[j];
					f4++;
				}
			}
			System.out.print(s);
			if(f4==0){
				System.out.print(" N");
			}else System.out.printf(" %.1f", f3/f4);
			
			int f5=0;
			for(int j=0;j<n;j++){
				if(c[j]%5==4){
					if(c[j]>f5){
						f5=c[j];
					}
				}
			}
			if(f5==0){
				System.out.print(" N");
			}else System.out.print(" "+f5);
	}

}
