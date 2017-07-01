import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while((line=bf.readLine())!=null){
			char[] c = line.toCharArray();
			Arrays.sort(c);
			for(char c1 :c){
				System.out.print(""+c1);
			}
			System.out.println();
		}
	}

}
