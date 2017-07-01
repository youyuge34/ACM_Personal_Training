package 三角形;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			Boolean f=true;
			BigDecimal a = in.nextBigDecimal();
			BigDecimal b=in.nextBigDecimal();
			BigDecimal c=in.nextBigDecimal();
			if(a.add(b).compareTo(c)!=1){
				f=false;
			}
			if(a.add(c).compareTo(b)!=1){
				f=false;
			}
			if(c.add(b).compareTo(a)!=1){
				f=false;
			}
			if(f){
				System.out.println("Yes");
			}else 
				System.out.println("No");
			
		}
		
	}

}
