package 旧键盘;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String s1=in.nextLine();
		ArrayList<Character> ll=new ArrayList<Character>();
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c=='_'&&s1.indexOf(c)==-1&&!ll.contains(c)){
				System.out.print(c);
				ll.add(c);
			}
			if(c<='9'&&c>='0'&&s1.indexOf(c)==-1&&!ll.contains(c)){
				System.out.print(c);
				ll.add(c);
			}
			if(c<='Z'&&c>='A'&&s1.indexOf(c)==-1&&!ll.contains(c)){
				System.out.print(c);
				ll.add(c);
			}
			if(c<='z'&&c>='a'&&s1.indexOf(c)==-1&&!ll.contains((char)(c+'A'-'a'))){
				System.out.print((char)(c+'A'-'a'));
				ll.add((char)(c+'A'-'a'));
			}
			
			
			
		}
		
	}

}
