import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String a=in.next();
		int b=in.nextInt();
		int m=0;
		int n=a.length();
		String s="";
		for(int i=0;i<n;i++){
			m=m*10+a.charAt(i)-'0';
			s+=m/b;
			m%=b;
		}

		char[] c =new char[1005];
		c=s.toCharArray();
		int i;
		for( i=0;i<s.length()-1;i++){
			if (c[i]!='0'){
				break;
			}
		}
		
		for(int j=i;j<s.length();j++){
			System.out.print(c[j]);
		}
		System.out.println(" "+m);
	}

}
