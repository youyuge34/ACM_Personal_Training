package 在霍格沃兹找零;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s1=in.next();
		String c[]=s1.split("\\.");
		System.out.println(c[0]);
	}

}
