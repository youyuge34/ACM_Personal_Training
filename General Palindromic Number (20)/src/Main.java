import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int d=in.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		if(n==0){
			list.add(0);
		}
		while(n!=0){
			list.add(n%d);
			n/=d;
		}
		int size=list.size();
//		System.out.println(size);
//		for(int i:list){
//			System.out.print(i+" ");
//		}
		Boolean f=true;
		for(int i=0;i<size/2;i++){
//			System.out.println(list.get(i)+" "+list.get(size-1-i));
			if(!list.get(i).equals(list.get(size-1-i))){
				f= false;
				break;
			}
		}
		if(f){
			System.out.println("Yes");
		}else System.out.println("No");
		String s="";
		for(int i=size-1;i>=0;i--){
			s+=(list.get(i)+" ");
		}System.out.println(s.trim());
	}

}
