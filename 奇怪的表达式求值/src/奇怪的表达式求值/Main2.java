package 奇怪的表达式求值;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);	
		String s=in.nextLine();
		char[] c=s.toCharArray();
		int n=s.length();
		int ans=c[0]-'0';
		for(int i=1;i<n;i+=2){
			switch(c[i]){
			case '+':
				ans+=(c[i+1]-'0');
			break;
			
			case '-':
				ans-=(c[i+1]-'0');
				break;
			
			case '*':
				ans*=(c[i+1]-'0');
				break;
				
			}
		}
		System.out.println(ans);
	}

}
