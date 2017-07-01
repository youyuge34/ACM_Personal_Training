package 直方图;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		while(in.hasNext()){
			String s=in.nextLine();
			char[] c=s.toCharArray();
			int[] co=new int[10];
			for(int i=0;i<10;i++){
				co[i]=0;
			}
			for(int i=0;i<s.length();i++){
				int j=c[i]-'0';
				co[j]++;
			}
			int max=co[0];
			for(int i=1;i<10;i++){
				if(max<co[i]){
					max=co[i];
				}
			}
			char[][] out=new char[max][10];
			for(int i=0;i<max;i++){
				for(int j=0;j<10;j++){
					out[i][j]=' ';
				}
			}
				for(int i=0;i<10;i++){
					for(int j=max-1;j>max-1-co[i];j--){
						out[j][i]='*';
					}
				}
				for(int i=0;i<max;i++){
					for(int j=0;j<10;j++){
						System.out.print(out[i][j]);;
					}
					System.out.println();
				}
				System.out.println("0123456789");
				
		}
		
	}

}
