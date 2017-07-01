package 成绩排名;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s1[] =new String[105];
		String s2[] =new String[105];
		int min=101;
		int max=-1;
		int mmin=0;
		int mmax=0;
		int n=in.nextInt();
		for(int i=1;i<=n;i++){
			 s1[i]=in.next();
			 s2[i]=in.next();
			int j=in.nextInt();
			if(j<min){
				min=j;
				mmin=i;
			}
			if(j>max){
				max=j;
				mmax=i;
			}
	
		}
		System.out.println(s1[mmax]+" "+s2[mmax]);
		System.out.println(s1[mmin]+" "+s2[mmin]);
		
	}

}
