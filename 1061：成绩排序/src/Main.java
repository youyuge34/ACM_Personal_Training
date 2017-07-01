import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class stu implements Comparable<stu> {
	String name;
	int age;
	int grade;

	public stu(String name, int age, int grade) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+age+" "+grade;
	}


	@Override
	public int compareTo(stu o) {
		int bGrade = new Integer(this.grade).compareTo(new Integer(o.grade));
		int bName = this.name.compareTo(o.name);
		
		if (bGrade!=0) {
			return bGrade;
		} 
		
		if(bName!=0){
			return bName;
		}else 
			return new Integer(this.age).compareTo(new Integer(o.age));
	}
}

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			ArrayList<stu> list = new ArrayList<stu>();
			int n = in.nextInt();
			for (int i = 0; i < n; i++) {
				list.add(new stu(in.next(), in.nextInt(), in.nextInt()));
			}
			Collections.sort(list);
			for (int i = 0; i < n; i++) {
				System.out.println(list.get(i));
			}
		}
			in.close();
	}

}
