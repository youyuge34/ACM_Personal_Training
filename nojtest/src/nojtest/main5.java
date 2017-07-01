package nojtest;

import java.util.Scanner;

//阶乘之和
public class main5 {
	public static long jie(int i){
		long ans=1;
		long sum=0;
		int count=1;
//		for(int j=1;j<=i;j++){
//			ans*=j;
//		}
		while(i!=0){
			ans*=(count++);
			ans%=1000000;
			sum+=ans;
			i--;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		long m=0;
		int n=in.nextInt();
//		for(int i=1;i<=n;i++){
//			m+=jie(i);
//		}
		m=jie(n);
		System.out.println(m%1000000);
		in.close();
	}

}
