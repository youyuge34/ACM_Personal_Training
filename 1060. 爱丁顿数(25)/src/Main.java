import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		double array[]=new double[n+2];
		for(int i=0;i<n;i++){
			double len=in.nextDouble();
			for(int j=1;j<len&&j<=n;j++){
				array[j]++;
			}
		}
		in.close();
		for(int i=n;i>0;i--){
			if(array[i]>=i){
				System.out.println(i);
				break;
			}
			if(i==1){
				System.out.println(0);
			}
		}
		
	}

}
