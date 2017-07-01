package 个位数统计;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
//		Scanner in=new Scanner(System.in);
//		String s=in.nextLine();
		String s=bfr.readLine();
		char c[]=new char[1005];
		c=s.toCharArray();
		int t[]=new int[10];
		for(int i:t){
			i=0;
		}
			for(char i:c){
				t[i-'0']++;
			}
			
			for(int i=0;i<10;i++){
				if(t[i]!=0){
				System.out.println(i+":"+t[i]);
			}
			}bfr.close();
	}

}
