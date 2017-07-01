package 数字黑洞;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static int low(int i){
		int c[]=new int[4];
		c[0]=i/1000;
		c[1]=i%1000/100;
		c[2]=i%100/10;
		c[3]=i%10;
		Arrays.sort(c);
		return c[3]*1000+c[2]*100+c[1]*10+c[0];
	}
	public static int up(int i){
		int c[]=new int[4];
		c[0]=i/1000;
		c[1]=i%1000/100;
		c[2]=i%100/10;
		c[3]=i%10;
		Arrays.sort(c);
		return c[0]*1000+c[1]*100+c[2]*10+c[3];
	}

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		if(up(n)==low(n)){
			System.out.println(n+" - "+n+" = 0000");
		}
		
		do{
			int l=low(n);
			int u=up(n);
			System.out.printf("%04d - %04d = %04d\n",l,u,l-u);
			n=l-u;
		}while(n!=6174);
	}
}
