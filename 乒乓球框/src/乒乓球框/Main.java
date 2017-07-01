package 乒乓球框;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		while(in.hasNext()){
			String a=in.next();
			String b=in.next();
			char[] a1=a.toCharArray();
			char[] b1=b.toCharArray();
			int m=a.length();
			int n=b.length();
			int j;int i;
			for( i=0;i<n;i++){
				for( j=0;j<m;j++){
					if(a1[j]==b1[i]){
						a1[j]=' ';
						break;
					}
				}
				
				if(j==m){
					System.out.println("No");
					break;
				}
				
			}if(i==n){
				System.out.println("Yes");
			}
			
		}
		
	}

}
