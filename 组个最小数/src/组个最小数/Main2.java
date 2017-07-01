package 组个最小数;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String c[]=bfr.readLine().split("\\s");
//		bfr.close();
		int a[]=new int[12];
		for(int i=0;i<c.length;i++){
			a[i]=Integer.valueOf(c[i]);
		}
		for(int i=1;i<c.length;i++){
			if(a[i]!=0){
				System.out.print(i);
				a[i]--;
				break;
			}
		}
		for(int i=0;i<10;i++){
			for(int j=0;j<a[i];j++){
				System.out.print(i);
			}
		}

	}

}
