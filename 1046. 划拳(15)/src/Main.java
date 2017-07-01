import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(bf.readLine());
		int a[]=new int[4];
		int jia=0;
		int yi=0;
		for(int i=0;i<n;i++){
			String[] s=bf.readLine().split("\\s");
			for(int j=0;j<4;j++){
				a[j]=Integer.parseInt(s[j]);
			}
			int he=a[0]+a[2];
			if(a[1]==he&&a[3]!=he){
				jia++;
			}else if(a[1]!=he&&a[3]==he){
				yi++;
			}
			
		}
		bf.close();
		System.out.println(yi+" "+jia);
	}

}
