import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
	
		Scanner in=new Scanner(System.in);
		String s[]=in.nextLine().split("\\s+");
//		String s[]=br.readLine().split("\\s+");
	
//		String a=in.next();
//		long current=System.currentTimeMillis();
		int da=Integer.parseInt(s[1]);
		int db=Integer.parseInt(s[3]);
//		String b=in.next();
//		int db=in.nextInt();
		long pa=0;
		long pb=0;
		char[] ca=new char[12];
		char[] cb=new char[12];
		
		ca=s[0].toCharArray();
		cb=s[2].toCharArray();
		
		for(char c: ca){
			if(da==c-'0'){
				pa=pa*10+da;
			}
		}
		for(char c: cb){
			if(db==c-'0'){
				pb=pb*10+db;
			}
		}
//		br.close();
		in.close();
		System.out.println(pa+pb);
//		System.out.println(System.currentTimeMillis()-current);
	}
	

}
