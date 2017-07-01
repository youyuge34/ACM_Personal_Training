package 有假币;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			if(n==0){
				break;
			}
			if(n==1){
				System.out.println(0);
			}
			else if(n<=3){
				System.out.println(1);
			}else{
				int j=1;
				 while(n>3){
		                if(n%3==0)
		                    n/=3;
		                else
		                    n=n/3+1;
		                j++;
		                
				 }System.out.println(j);
			}
		}
	}

}
