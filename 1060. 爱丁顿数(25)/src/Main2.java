import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		ArrayList<Double> list=new ArrayList<Double>();
		for(int i=0;i<n;i++){
			list.add(in.nextDouble());
		}
		Collections.sort(list);
		Collections.reverse(list);
		for(int i=0;i<n;i++){
			if(list.get(i)<=i+1){
				System.out.println(list.get(i));
			}
			if(i==n-1){
				System.out.println(0);
			}
		}
		
		
	}

}
