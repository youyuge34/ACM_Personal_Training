package nojtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		while(in.hasNextInt()){
			list.add(in.nextInt());
		}
		System.out.println(list.size());
//		Collections.sort(list);
//		if(list.size()%2==1){
//			System.out.println(list.get((list.size()+1)/2-1));
//		}else System.out.println((list.get(list.size()/2-1)+list.get(list.size()/2)/2.0));
		

	}

}
