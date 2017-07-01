import java.util.Scanner;

public class decimal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b,c;
		String s="";
		int count=0;
		do{ a=in.nextInt();
		 b=in.nextInt();
		 c=in.nextInt();
		if(a>0&&b>0&&c>0&&a<=100000&&b<=1000000&&c<=100){
			double p=(double)a/b;
			double m=Math.pow(10, c);
			p=Math.round(p*m)/m;
			count++;
			s+="Case "+count+": "+p+"\n";
		}
		
		}
			while(a!=0||b!=0||c!=0);
		
		System.out.println(s);
	}

}
