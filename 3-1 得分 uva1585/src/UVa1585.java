import java.util.Scanner;

public class UVa1585 {

	public static void main(String[] args) {
		int sum=0;
		Scanner in = new Scanner(System.in);
		String s=in.nextLine();
		char[] c =s.toCharArray();
		int[] c1=new int[83];
		if (c[0]=='O'){
			c1[0]=1;
		}else c1[0]=0;
		for(int i=1;i<s.length();i++){
			if(c[i]=='O'){
				c1[i]=c1[i-1]+1;
			} else c1[i]=0;
		}
		for (int i=0;i<s.length();i++){
			sum+=c1[i];
		}
		System.out.println(sum);
	}

}
