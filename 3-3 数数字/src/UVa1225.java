import java.util.Scanner;

public class UVa1225 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		String s=in.nextLine();
		char[] c=s.toCharArray();
		int[] c1=new int[10];
		for(int i=0;i<10;i++){
			c1[i]=0;
		}
		for (int i=0;i<s.length();i++){
			c1[c[i]-'0']++;
		}
		for(int i=0;i<9;i++){
			System.out.print(c1[i]+" ");
		}
		System.out.print(c1[9]);
	}

}
