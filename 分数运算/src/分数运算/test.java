package 分数运算;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		// int n=in.nextInt();
		String n = in.next();
		String s[]=n.split("/");
		int n1=Integer.parseInt(s[1]);
		System.out.println(n1);
	}
}
