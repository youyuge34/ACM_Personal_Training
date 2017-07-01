import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String numear=in.next();
		String numlate=numear;
		String early=(in.next());
		String late=(in.next());
		for(int i=1;i<n;i++){
			String temp=in.next();
			String tempe=(in.next());
			String templ=(in.next());
			if(tempe.compareTo(early)<0){
				early=tempe;
				numear=temp;
			}
			if(templ.compareTo(late)>0){
				late=templ;
				numlate=temp;
			}
		}
		System.out.println(numear+" "+numlate);
	}

}
