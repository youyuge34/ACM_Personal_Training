import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		while(in.hasNext()){
			String s = in.next();
			char[] c = new char[s.length()];
			ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == '('){
					deque.push(i);
					c[i]='$';
				}else if(s.charAt(i) == ')'){
					if(deque.isEmpty()){
						c[i] = '?';
					}else {
						int j = deque.pop();
						c[j] = ' ';
						c[i]= ' ';
					}
					
				}else c[i]=' ';
			}
			
			
			System.out.println(s);
			for (int i = 0; i < c.length; i++) {
				System.out.print(c[i]);
			}
			System.out.println();
			
		}
		
	}

}
