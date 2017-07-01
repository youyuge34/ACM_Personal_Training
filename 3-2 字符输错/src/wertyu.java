import java.util.Scanner;

public class wertyu {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s=in.nextLine();
		char[] c =s.toCharArray();
		String s1="`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
		char[] c2=s1.toCharArray();
		for (int i=0;i<s.length();i++){
			int j;
			for(j=0;j<s1.length()&&c[i]!=c2[j];j++){
			}
			if(j<s1.length()){c[i]=c2[j-1];}
			
		}
		System.out.println(c);
	}

}
