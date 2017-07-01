package nojtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Scanner sc=new Scanner(in.nextLine());
		ArrayList<Integer> list=new ArrayList<Integer>();
		while(sc.hasNext()){
			list.add(sc.nextInt());
		}
		int n=list.size();
		Collections.sort(list);
//		System.out.println(list.toString());
		if(n%2==1){
			System.out.println(list.get(n/2));
		}else System.out.println((list.get(n/2)+list.get(n/2-1))/2.0);
		in.close();
		sc.close();
	}

}
