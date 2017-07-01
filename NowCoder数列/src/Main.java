import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLong()) {
			int n = in.nextInt();
			if((n+1)%4==3){
				System.out.println("Yes");
			}else 
			System.out.println("No");
		}
	}
}
