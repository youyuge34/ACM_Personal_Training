import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		ArrayList<Long> list=new ArrayList<Long>();
		for(int i=0;i<m;i++){
			list.add(in.nextLong());
		}
		int n=in.nextInt();
		for(int i=0;i<n;i++){
			list.add(in.nextLong());
		}
		
		Collections.sort(list);
		System.out.println(list.get((list.size()-1)/2));
	

}
}