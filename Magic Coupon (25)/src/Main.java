import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int az,bz;
		int m=in.nextInt();
		long a[]=new long[m];
		for(int i=0;i<m;i++){
			a[i]=in.nextLong();
		}
		int n=in.nextInt();
		long b[]=new long[n];
		for(int i=0;i<n;i++){
			b[i]=in.nextLong();
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i=0;;i++){
			if(a[i]>0){
				az=i;break;
			}
		}
		for(int i=0;;i++){
			if(b[i]>0){
				bz=i;break;
			}
		}
		long sum=0;
		for(int i=0;i<az&&i<bz;i++){
			sum+=a[i]*b[i];
		}
		for(int i=m-1,j=n-1;i>=az&&j>=bz;i--,j--){
			sum+=a[i]*b[j];
		}
		System.out.println(sum);
	}

}
