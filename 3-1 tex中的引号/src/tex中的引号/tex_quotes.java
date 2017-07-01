package tex中的引号;

import java.util.Scanner;

public class tex_quotes {

	public static void main(String[] args) {
		int n=0;
		Scanner in = new Scanner(System.in);
		String s=in.nextLine();
		String s1;
		for(int i=0;i<s.length();i++){
		if(s.contains("\"")){
			if(n%2==0){
				s=s.replaceFirst("\"", "“");
				n++;
			}
			else{
				s=s.replaceFirst("\"", "”");
				n++;
			}
			
		}else break;
		}
		System.out.println(s);
	}
 
}
