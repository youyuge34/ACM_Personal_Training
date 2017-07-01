package nojtest;

import java.math.BigInteger;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		BigInteger a=new BigInteger(in.next());
		BigInteger b=new BigInteger(in.next());
		in.close();
		System.out.print(a.add(b));
	}

}
