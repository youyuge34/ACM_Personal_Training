package 旧键盘打字;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		 BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
//		Scanner in=new Scanner(System.in);
//		String s1=in.nextLine();
//		String s2=in.nextLine();
		 String s1=bfr.readLine();
		 String s2=bfr.readLine();
		int  f[]=new int[500];
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		for (int i=0;i<s1.length();i++){
			f[(int)c1[i]]=1;
		}
		for(int i=0;i<s2.length();i++){
			if((c2[i]<='z'&&c2[i]>='a')&&f[(int)(c2[i]-'a'+'A')]!=1){
				System.out.print(c2[i]);
			}
			if(c2[i]>='A'&&c2[i]<='Z'&&f[(int)c2[i]]!=1&&f[(int)'+']!=1){
				System.out.print(c2[i]);
			}
			if((c2[i]=='_'||c2[i]==','||c2[i]=='.'||c2[i]=='-'||(c2[i]<='9'&&
					c2[i]>='0'))&&f[(int)(c2[i])]!=1){
				System.out.print(c2[i]);
			}
			
		}
		bfr.close();
	}

}
