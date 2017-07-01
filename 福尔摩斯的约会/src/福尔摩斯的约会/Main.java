package 福尔摩斯的约会;

import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Main {
	public  static void main(String[] args){
		Scanner in= new Scanner(System.in);
		String a=in.nextLine();
		String b=in.nextLine();
		String c=in.nextLine();
		String d=in.nextLine();
		String s="";
		Boolean f=true;
		for(int i=0;i<a.length()&&i<b.length();i++){
			if(f&&a.charAt(i)==b.charAt(i)&&'A'<=a.charAt(i)&&a.charAt(i)<='Z'){
				f=false;
				switch(a.charAt(i)){
				case 'A':
					s+="MON ";
					break;
				case 'B':
					s+="TUE ";
					break;
				case 'C':
					s+="WED ";
					break;
				case 'D':
					s+="THU ";
					break;
				case 'E':
					s+="FRI ";
					break;
				case 'F':
					s+="SAT ";
					break;
				case 'G':
					s+="SUN ";
					break;
				
				}
				continue;
			}
			if(!f&&a.charAt(i)==b.charAt(i)){
				if('0'<=a.charAt(i)&&a.charAt(i)<='9'){
					s+="0"+a.charAt(i)+":";
				}else if('A'<=a.charAt(i)&&a.charAt(i)<='N'){
					s+=a.charAt(i)-'A'+10+":";
				}
				
				break;
			}
				
			
		}
		
		for(int i=0;i<c.length()&&i<d.length();i++){
			if((c.charAt(i)>='A'&&c.charAt(i)<='Z')||(c.charAt(i)>='a'&&c.charAt(i)<='z')&&c.charAt(i)==d.charAt(i)){
				if(i<10){
					s+="0"+i;
				}else s+=i;
				break;
			}
			
		}
		System.out.println(s);
		in.close();
	}
}
