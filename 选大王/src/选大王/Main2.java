package 选大王;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int n=in.nextInt();
			int m=in.nextInt();
			int k=0;
			for (int i=2;i<=n;i++){
				k=(k+m)%i;
			}
			System.out.println(k+1);
		}
		
	}

}
