import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		if(n<=20&&n>=0){
			for(int i=n;i>=1;i--){
				for(int j=n-i;j>0;j--){
					System.out.print(" ");
				}
				
				for(int k=2*i-1;k>0;k--){
					System.out.print("#");
				}
				
				for(int m=n-i;m>0;m--){
					System.out.print(" ");
				}
				
				System.out.println();
				
				
				
			}
			
			
			
			
			
		}
		in.close();
	}

}
