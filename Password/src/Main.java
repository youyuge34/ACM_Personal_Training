import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		ArrayList<String> lista=new ArrayList<String>();
		ArrayList<String> listb=new ArrayList<String>();
		for(int i=0;i<n;i++){
			String a=in.next();
			String b=in.next();
			if(b.contains("1")||b.contains("0")||b.contains("l")||b.contains("O")){
				b=b.replaceAll("1","@");
				b=b.replaceAll("0","%");
				b=b.replaceAll("l","L");
				b=b.replaceAll("O","o");
				lista.add(a);
				listb.add(b);
			}
		}
		if(lista.isEmpty()){
			if(n==1){
			System.out.println("There is "+n+ " account and no account is modified");}
			else System.out.println("There are "+n+ " accounts and no account is modified");
		}else{
			System.out.println(lista.size());
			for(int i=0;i<lista.size();i++){
				System.out.println(lista.get(i)+" "+listb.get(i));
			}
			
			
			
			
		}
		
	}

}
