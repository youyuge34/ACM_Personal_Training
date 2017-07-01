package 到底买不买;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String a=in.next();
		String b=in.next();
		int cha=a.length()-b.length();
		int count=0;
		for(int i=0;i<b.length();i++){
			if(a.contains(String.valueOf(b.charAt(i)))){
				a=a.replaceFirst(String.valueOf(b.charAt(i)),"");	
				}else {
					count++;
				}
			
		}
		if(count==0){
			System.out.println("Yes "+cha);
		}else System.out.println("No "+count);
	}

}
