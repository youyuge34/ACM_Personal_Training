import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
			long c=in.nextLong()+in.nextLong();
			int d=in.nextInt();
			String s="";
			
			while(c!=0){
				s=c%d+s;
				c/=d;
			}
			System.out.println(s);
			
	}

}
