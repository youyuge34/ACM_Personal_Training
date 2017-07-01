import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		boolean mark[] = new boolean[10001];
		for (int i = 0; i < mark.length; i++) {
			mark[i] = false;
		}
		for (int i = 2; i < mark.length; i++) {
			if (mark[i])
				continue;
			for (int j = i * i; j < mark.length; j+=i) {
				mark[j]=true;
			}
		}
		while (in.hasNext()) {
			int n = in.nextInt();
			StringBuilder sb = new StringBuilder();
			for(int i =11;i<n;i+=10){
				if(!mark[i]){
					sb.append(i+" ");
				}
			}
			System.out.println(sb.toString().isEmpty()?"-1":sb.toString().trim());;
		}
	}

}
