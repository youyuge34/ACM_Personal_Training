package 有几个pat;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		long p=0;
		long a=0;
		long t=0;
		char c[]=in.nextLine().toCharArray();
		for(int i=0;i<c.length;i++){
			if(c[i]=='P'){
				p++;
			}else if(c[i]=='A'){
				a+=p;
				a%=1000000007;
			}else if(c[i]=='T'){
				t+=a;
				t%=1000000007;
			}
		}
		System.out.println(t);
		
	}

}
