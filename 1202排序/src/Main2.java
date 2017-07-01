import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line=null;
		while ((line=bf.readLine())!=null ){
			String[] s= line.split(" ");
			System.out.println(Integer.parseInt(s[0])+Integer.parseInt(s[1]));
		}
		
	}

}
