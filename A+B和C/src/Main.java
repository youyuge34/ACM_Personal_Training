import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner in= new Scanner(System.in);
			int n=in.nextInt();
			for(int i=1;i<=n;i++){
				long a=in.nextLong();
				long b=in.nextLong();
				long c=in.nextLong();
				System.out.println("Case #"+i+": "+(a+b>c));
				
				
			}in.close();
	}

}
