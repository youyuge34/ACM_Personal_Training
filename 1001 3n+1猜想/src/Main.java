import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int n=in.nextInt();
			int sum=0;
			while(n!=1){
				if(n%2==0){
					n/=2;
				}else{
					n=(3*n+1)/2;
				}
				sum++;
				
				
			}
			
			System.out.println(sum);
			
		}
		
	}

}
