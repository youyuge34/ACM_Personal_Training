import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			ArrayList<Integer> list =new ArrayList<Integer>();
			for(int i=0;i<n;i++){
				list.add(in.nextInt());
			}
			Collections.sort(list);
			for(int i=0;i<n;i++){
				System.out.print(list.get(i)+" ");
			}
			System.out.println();
		}
		
		in.close();
	}

}
