import java.util.Scanner;

public class Main {
	public static boolean gcd(int a,int b){
		while(a%b!=0){
			int c=b;
			b=a%b;
			a=c;
		}
		if(b==1){
		return true;}
		else return false;
	}

	public static void main(String[] args) {
		Boolean f=true;
		Scanner in=new Scanner(System.in);
		String[] s1=in.next().split("/");
		String[] s2=in.next().split("/");
		int n=in.nextInt();
		
		double min=(double)Integer.valueOf(s1[0])/Integer.valueOf(s1[1]);
		double max=(double)Integer.valueOf(s2[0])/Integer.valueOf(s2[1]);
		if(min>max){
			double temp=min;
			min=max;
			max=temp;
		}
		
		for(int i=1;i<n;i++){
			if((double)i/n>min&&max>(double)i/n&&gcd(i,n)){
				if(f){
				System.out.print(i+"/"+n);
				f=false;
				}else System.out.print(" "+i+"/"+n);
			}
		}
		
	}

}
