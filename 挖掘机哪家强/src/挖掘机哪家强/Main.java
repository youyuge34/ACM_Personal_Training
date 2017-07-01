package 挖掘机哪家强;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=n;
		int sum[]=new int[1000005];
		while(n--!=0){
			int i=in.nextInt();
			int fen=in.nextInt();
			sum[i]+=fen;
		}
		int max=0;
		int j=0;
//		for(int i:sum){
//			System.out.print(i+" ");
//		}
		for(int i=0;i<100005;i++){
			if(sum[i]>max){
				max=sum[i];
				j=i;
			}
		}
		System.out.print(j+" "+max);
	}

}
