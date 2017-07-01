import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class stu {
	String id;
	String name;
	int grade;

	public stu(String id, String name, int grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+name+" "+grade;
	}
	
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mcase = 1;
		int n ;
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			n = in.nextInt();
			int c = in.nextInt();
			if(n==0 && c == 0){
				break;
			}
			System.out.println("Case " + mcase++ + ":");
			ArrayList<stu> list = new ArrayList<stu>();
			for (int i = 0; i < n; i++) {
				list.add(new stu(in.next(), in.next(), in.nextInt()));
			}
			
			switch(c){
			case 1:
				Collections.sort(list,new Comparator<stu>() {

					@Override
					public int compare(stu o1, stu o2) {
						return o1.id.compareTo(o2.id);
					}
				});
				break;
				
			case 2:
				Collections.sort(list,new Comparator<stu>() {

					@Override
					public int compare(stu o1, stu o2) {
						if(o1.name.compareTo(o2.name)!=0){
							return o1.name.compareTo(o2.name);
						}
						else return o1.id.compareTo(o2.id);
					}
				});
				break;
			case 3:
				Collections.sort(list,new Comparator<stu>() {

					@Override
					public int compare(stu o1, stu o2) {
						if(o1.grade!= o2.grade){
							return o1.grade-(o2.grade);
						}
						else return o1.id.compareTo(o2.id);
					}
				});
				break;
			}
			
			for(int i=0;i<list.size();i++){
				System.out.println(list.get(i));
			}
			
		}
	}

}
