package 完美数列;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String s1[]=bf.readLine().split("\\s");
		String s2[]=bf.readLine().split("\\s");
		bf.close();
//		Scanner in=new Scanner(System.in);
		int n=Integer.parseInt(s1[0]);
		long p=Long.parseLong(s1[1]);
		long c[]=new long[n];
		for(int i=0;i<n;i++){
			c[i]=Long.parseLong(s2[i]);
		}
		int max=0;
		Arrays.sort(c);
		for(int i=0;i<n;i++){
			for(int j=max;j+i<n;j++){
				if(c[i]*p<c[i+j]){
					break;
				}
				max++;
			}
		}
		System.out.println(max);
	}
}
