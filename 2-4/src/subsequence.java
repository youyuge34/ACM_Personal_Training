import java.io.FileInputStream;
import java.text.DecimalFormat;
import java.util.Scanner;

public class subsequence {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df1 = new DecimalFormat("0.00000");
//		try{in=new Scanner(new FileInputStream("data.in"));}catch(Exception e){}
		int count=0;
		String s = "";
		long  n=in.nextLong(); 
		long  m=in.nextLong();
		if(0<n&&n<m&&m<1000000){
				while(n!=0&&m!=0){
					double sum=0;
					for(long i=n;i<=m;i++){
						sum+=1.0/i/i;
					}
					  n=in.nextLong(); 
					  m=in.nextLong();
					  count++;
					  s+="Case "+count+": "+df1.format(sum)+"\n";
//					System.out.printf("Case %d: %.5f",count,sum);
				}
				System.out.print(s);
	}}

}
