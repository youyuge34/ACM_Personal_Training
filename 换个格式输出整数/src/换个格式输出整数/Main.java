package 换个格式输出整数;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int n=in.nextInt();
			int bai=n/100;
			int shi=n%100/10;
			int ge=n%10;
			String s="";
			for(int i=0;i<bai;i++){
				s+="B";
			}
			for(int i=0;i<shi;i++){
				s+="S";
			}
			for(int i=1;i<=ge;i++){
				s+=i;
			}
			System.out.println(s);
			
		}
		
	}

}
