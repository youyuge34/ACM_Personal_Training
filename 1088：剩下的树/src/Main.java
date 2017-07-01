import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		while(in.hasNext()){
			int l = in.nextInt();
			int m = in.nextInt();
			int trees[] = new int[l+1];
			for(int i = 0;i<l+1;i++){
				trees[i]= 0;
			}
			for(int i=0;i<m;i++){
				int start = in.nextInt();
				int end = in.nextInt();
				for(int j=start;j<=end;j++){
					trees[j] =1;
				}
			}
			int count = 0;
			for(int i = 0;i<l+1;i++){
				if(trees[i]==0){
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
