import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String c[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		BigInteger sum=new BigInteger("0");
		for(int i=0;i<s.length();i++){
			sum=sum.add(new BigInteger(String.valueOf(s.charAt(i))));
		}
		s=sum.toString();
		for(int i=0;i<s.length();i++){
			if(i!=0){
				System.out.print(" ");
			}
			System.out.print(c[(int)(s.charAt(i)-'0')]);
		}
	}
}
