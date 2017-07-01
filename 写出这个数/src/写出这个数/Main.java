package 写出这个数;

import java.util.Scanner;

public class Main {
	static Boolean f=true;
	public  static void p(String s){
		if(f){
			System.out.print(s);
			f=false;
		}else System.out.print(" "+s);
	}

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		while(in.hasNext()){
			String s=in.next();
			char c[]= new char[105];
			c=s.toCharArray();
			int sum=0;
			for(int i=0;i<s.length();i++){
				sum+=c[i]-'0';
			}
//			System.out.println(sum);
//			Main main=new Main();
			String s1=String.valueOf(sum);
//			System.out.println(s1);
			char c1[]=new char[102];
			c1=s1.toCharArray();
			for(int i=0;i<s1.length();i++){
				switch(c1[i]){
				case '1':
					p("yi");break;
				case '0':
					p("ling");break;
				case '2':
					p("er");break;
				case '3':
					p("san");break;
				case '4':
					p("si");break;
				case '5':
					p("wu");break;
				case '6':
					p("liu");break;
				case '7':
					p("qi");break;
				case '8':
					p("ba");break;
				case '9':
					p("jiu");break;
				
				
				}
			}
		}
		System.out.println();
	}

}
