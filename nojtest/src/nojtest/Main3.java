package nojtest;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) throws Exception{
		Scanner in=new Scanner(System.in);
		int max=-1;
		int min=101;
		int n;
		while(in.hasNext()){
		      n=in.nextInt();
			 max=Integer.MIN_VALUE;
			 min=Integer.MAX_VALUE;
			for(int i=0;i<n;i++){
				int a=in.nextInt();
				if(a<min){
					min=a;
				} if(a>max){
					max=a;
				}
			}
			System.out.println(max+ " "+min);
		}
		
	}

}
