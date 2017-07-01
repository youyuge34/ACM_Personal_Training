import java.util.Scanner;

public class Main {
	public static String convert(int n){
		String c[]={"0","1","2","3","4","5","6","7","8","9","A","B","C"};
		String s="";
		s+=c[n/13];
		s+=c[n%13];
		return s;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("#");
		for(int i=0;i<3;i++){
			System.out.print(convert(in.nextInt()));
		}
		
	}

}
