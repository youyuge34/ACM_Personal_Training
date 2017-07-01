package 送外卖;

import java.math.BigDecimal;
import java.math.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		while(in.hasNext()){
			BigInteger m=in.nextBigInteger();
			BigInteger n=in.nextBigInteger();
			if(m.mod(new BigInteger("2")).compareTo(new BigInteger("1"))==0
					&&n.mod(new BigInteger("2")).compareTo(new BigInteger("1"))==0){
				System.out.println(m.multiply(n)+".41");
			}else System.out.println(m.multiply(n)+".00");
			
		}
		
	}

}
