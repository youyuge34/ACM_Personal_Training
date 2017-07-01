import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public  ArrayList<Integer> c=new ArrayList<Integer>();
	public  void record(int n){
		while(n!=1){
			if(n%2==0){
				n/=2;
				c.add(n);
			}else{
				n=(3*n+1)/2;
				c.add(n);
			}
		}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		Main m=new Main();
		int c1[]=new int[102];
		for(int i=0;i<n;i++){
			c1[i]=in.nextInt();
			m.record(c1[i]);
		}
		Boolean f=true;
		ArrayList<Integer> b=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			if(m.c.indexOf(c1[i])==-1){
				b.add(c1[i]);
			}
		}
		
		Collections.sort(b);
		Collections.reverse(b);
		for(int i=0;i<b.size();i++){
			if(f){
				System.out.print(b.get(i));
				f=false; 
			}else {
				System.out.print(" "+b.get(i));
			}
			
			
		}
	}

}
