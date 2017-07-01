package 组个最小数;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String s[]=bfr.readLine().split("\\s");
		bfr.close();
		int[] c=new int[11];
		int[] f=new int[55];
		int n=0;
		for(int i=0;i<s.length;i++){
			c[i]=Integer.valueOf(s[i]);
		}
		for(int i=0;i<s.length;i++){
			for(int j=0;j<c[i];j++){
				f[n++]=i;
			}
		}
		int m=0;
		while(f[m]==0){
			m++;
		}
		int temp;
		temp=f[0];
		f[0]=f[m];
		f[m]=temp;
		for(int i=0;i<n;i++){
			System.out.print(f[i]);
		}
		
	}

}
