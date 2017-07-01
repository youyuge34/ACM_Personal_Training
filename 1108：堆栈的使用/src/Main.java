import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = 0;
		while((n=in.nextInt())!=0){
//			if(n == 0){
//				break;
//			}
			ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
			
			for (int i = 0; i < n; i++) {
				String s=in.next();
				if(s.equals("P")){
					stack.push(in.nextInt());
				}else if(s.equals("O")){
					if(!stack.isEmpty()){
						stack.pop();
					}
				}else if(s.equals("A")){
					if(stack.isEmpty()){
						System.out.println("E");
					}else System.out.println(stack.peek());
				}
			}
			System.out.println();
		}
	}

}
