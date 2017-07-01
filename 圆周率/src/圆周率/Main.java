package 圆周率;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		while(in.hasNext()){
			int a=in.nextInt();
			int b=in.nextInt();
			int n=in.nextInt();
			System.out.print("0.");
				for(int i=1;i<=n;i++){
					a*=10;
					System.out.print(a/b);
					a%=b;
				}
				System.out.println();
		}
		
	}

}
