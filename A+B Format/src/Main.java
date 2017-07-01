import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		long a=in.nextLong();
		long b=in.nextLong();
		long c=a+b;
		
		if(c<0){
			System.out.print("-");
			c=0-c;
		}
		
		String s=String.valueOf(c);
		String out="";
		int count=0;
		for(int i=s.length()-1;i>=0;i--){
			out=s.charAt(i)+out;
			count++;
			if(count%3==0&&i!=0){
				count=0;
				out=","+out;
			}
			
		}System.out.println(out);
	}

}
