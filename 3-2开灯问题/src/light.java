import java.util.Scanner;

public class light {

	public static void main(String[] args) {
		boolean t=true;
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int[] a=new int[n];
		for (int i=0;i<a.length;i++){
			a[i]=0-1;
		}
		for (int i=1;i<=k;i++){
			for (int j=1;j<=n;j++){
			if(j%i==0){
				a[j-1]=0-a[j-1];
				
			}
			}
		}   for(int i=0;i<a.length;i++){
				if(a[i]==1){
					if(!t){
						System.out.print(" ");
					}
					t=false;
					
					System.out.print(i+1);
				}
		}
	}

}
