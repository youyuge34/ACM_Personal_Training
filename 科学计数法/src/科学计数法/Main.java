package 科学计数法;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String c[]=s.split("E");
		StringBuffer a=new StringBuffer(c[0]);
		int n=Integer.valueOf(c[1].substring(1));
		if(a.charAt(0)=='-'){
			System.out.print("-");
		}
		a.deleteCharAt(0);
		a.deleteCharAt(1);
		if(c[1].charAt(0)=='-'){
			System.out.print("0.");
			for(int i=0;i<n-1;i++){
				System.out.print("0");
			}
			System.out.print(a);
		}else {
			if(n>=a.length()-1){
				System.out.print(a);
				for(int i=0;i<n+1-a.length();i++){
					System.out.print("0");
				}
			}else {
				a.insert(n+1,".");
				System.out.print(a);
			}
			
			
			
			
			
			
		}
		
	}

}
