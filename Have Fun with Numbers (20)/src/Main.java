import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		BigInteger n=new BigInteger(s);
		int a[]=new int[10];
		int b[]=new int[10];
		for(int i:a){
			i=0;
		}
		for(int i:b){
			i=0;
		}
		for(int i=0;i<s.length();i++){
			a[(int)(s.charAt(i)-'0')]++;
		}
		BigInteger n2=(n.multiply(new BigInteger("2")));
		s=String.valueOf(n2);
		for(int i=0;i<s.length();i++){
			b[(int)(s.charAt(i)-'0')]++;
		}
		Boolean f=true;
		for(int i=0;i<10;i++){
			if(a[i]!=b[i]){
				f=false;
				break;
			}
		}if(f){
			System.out.println("Yes");
		}else System.out.println("No");
		System.out.println(s);
	}

}
