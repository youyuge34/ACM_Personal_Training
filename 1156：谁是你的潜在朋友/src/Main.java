import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int m = in.nextInt();
			int a[] = new int[n];
			int bei[] = new int[m+1];
			
			for(int i=0;i<bei.length;i++){
				bei[i] = 0;
			}
			
			for(int i=0;i<n;i++){
				a[i] = in.nextInt();
				bei[a[i]] ++ ;
			}
			
			for(int i=0;i<n;i++){
				if(bei[a[i]] == 1){
					System.out.println("BeiJu");
				}else System.out.println(bei[a[i]]-1);
			}
			
		}
	}

}
