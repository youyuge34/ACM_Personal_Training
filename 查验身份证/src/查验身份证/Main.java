package 查验身份证;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Boolean f=true;
		int []quan=new int[]{7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
		int n=in.nextInt();
		 char m[]={'1','0','X','9','8','7','6','5','4','3','2'};
		 ok:
		while(n--!=0){
			int sum=0;
			String s=in.next();
			char c[]=s.toCharArray();
		
			for(int i=0;i<17;i++){
				if(c[i]>'9'||c[i]<'0'){
					System.out.println(s);
					f=false;
					continue ok;
				}
				sum+=(int)(c[i]-'0')*quan[i];
			}
			sum%=11;
			if(m[sum]!=c[17]){
				System.out.println(s);
				f=false;
			}
		}
		if(f){
			System.out.println("All passed");
		}
	}

}
