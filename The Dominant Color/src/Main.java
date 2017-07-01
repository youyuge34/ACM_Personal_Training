import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		n*=m;
		for(int i=0;i<n;i++){
			String s=in.next();
			if(map.containsKey(s)){
				int value=map.get(s);
				map.remove(s);
				map.put(s, value+1);
			}
			else{
				map.put(s,1);
			}
		}
		for(String s:map.keySet()){
			if(map.get(s)>n/2.0){
				System.out.println(s);
			}
		}
	}
	
}
