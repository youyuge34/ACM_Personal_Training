import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static int reverse(int i,int d){
		ArrayList<Integer> list=new ArrayList<Integer>();
		while(i!=0){
			list.add(i%d);
			i=i/d;
		}
		int sum=0;
		for(int j=0;j<list.size();j++){
			sum=sum*d+list.get(j);
		}
		return sum;
	}
	public static 	boolean isprime(int m){
		Boolean f=true;
		if(m==1) return false;
		if(m==2) return f;
		for(int i=2;i<Math.sqrt(m);i++){
			if(m%i==0){
				f=false;
				break;
			}
		}
		return  f;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n;
		while((n=in.nextInt())>0){
			int d=in.nextInt();
			if(isprime(n)&&isprime(reverse(n, d))){
				System.out.println("Yes");
			}else System.out.println("No");
		}
	}

}
