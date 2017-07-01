package 锤子剪刀布;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(new BufferedInputStream(System.in));
		int n=in.nextInt();
		int j[]={0,0,0};
		int y[]={0,0,0};
		int js[]={0,0,0};
		int ys[]={0,0,0};
		String c="C";
		String ji="J";
		String bu="B";
		for(int i=0;i<n;i++){
			String a=in.next();
			String b=in.next();
			if(a.equals(b)){
				j[1]++;
				y[1]++;
				continue;
			}
			if(a.equals(c)&&b.equals(ji)){
				j[0]++;
				y[2]++;
				js[0]++;
			}
			else if(a.equals(ji)&&b.equals(bu)){
				j[0]++;
				y[2]++;
				js[1]++;
			}
			else if(a.equals(bu)&&b.equals(c))
					{
				j[0]++;
				y[2]++;
				js[2]++;
			}
			else if(a.equals(ji)&&b.equals(c)){
				y[0]++;
				j[2]++;
				ys[0]++;
			}
			else if(a.equals(bu)&&b.equals(ji)){
				y[0]++;
				j[2]++;
				ys[1]++;
			}
			else if(a.equals(c)&&b.equals(bu))
					{
				y[0]++;
				j[2]++;
				ys[2]++;
			}
			
			
		}
		System.out.println(j[0]+" "+j[1]+" "+j[2]);
		System.out.println(y[0]+" "+y[1]+" "+y[2]);
		if(js[2]>=js[1]&&js[2]>=js[0]){
			System.out.print("B ");
		}else if(js[0]>=js[1]&&js[0]>=js[2]){
			System.out.print("C ");
		}else System.out.print("J ");
		
		if(ys[2]>=ys[1]&&ys[2]>=ys[0]){
			System.out.print("B");
		}else if(ys[0]>=ys[1]&&ys[0]>=ys[2]){
			System.out.print("C");
		}else System.out.print("J");
	}

}
