package 说反话;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String c[]=s.split(" ");
		Boolean f=true;
		for(int i=c.length-1;i>=0;i--){
			if(f){
				System.out.print(c[i]);
				f=false;
			}else {
				System.out.print(" "+c[i]);
			}
		}
	}

}
