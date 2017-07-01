import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		float c[]=new float[1000];
		for(int i=0;i<m;i++){
			int g=in.nextInt();
			c[g]+=in.nextFloat();
		}
		int n=in.nextInt();
		for(int i=0;i<n;i++){
			int g=in.nextInt();
			c[g]+=in.nextFloat();
		}
		DecimalFormat f=new DecimalFormat("0.0");
		int count=0;
		String s="";
		for(int i=c.length-1;i>=0;i--){
			if(c[i]!=0){
				count++;
				s=s+" "+i+" "+f.format(c[i]);
			}
		}
		System.out.print(count+s);
	}
}
