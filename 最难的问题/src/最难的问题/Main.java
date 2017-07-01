package 最难的问题;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		while(in.hasNext()){
			String s=in.nextLine();
			char[] c=s.toCharArray();
			for(int i=0;i<s.length();i++){
				if(c[i]==' '){
					System.out.print(" ");
				}else if('A'<=c[i]&&c[i]<='E'){
					System.out.print((char)(c[i]+21));
				}else 
					System.out.print((char)(c[i]-5));
				
				
			}System.out.println();
		}
		
	}

}
