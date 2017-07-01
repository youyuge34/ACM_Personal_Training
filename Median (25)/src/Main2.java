import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int a[]=new int[m];
		for(int i=0;i<m;i++){
			a[i]=in.nextInt();
		}
		int n=in.nextInt();
		int b[]=new int[n];
		for(int i=0;i<n;i++){
			b[i]=in.nextInt();
		}

		int loc=(m+n+1)/2;
		int count=0;
		int i=0;
		int j=0;
		int median=0;
		while(count<loc){
			if(a[i]<b[j]){
				median=a[i++];
			}else median=b[j++];
			count++;
		}
		System.out.println(median);
	}

}
