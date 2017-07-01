import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		HashMap<Integer,Student> map=new HashMap<Integer,Student>();
		int n=in.nextInt();
		for(int i=0;i<n;i++){
			String a=in.next();
			int b=in.nextInt();
			int c=in.nextInt();
			Student stu=new Student(a, b, c);
			map.put(b,stu);
		}
		int m=in.nextInt();
		for(int i=0;i<m;i++){
			Student stu2=map.get(in.nextInt());
			System.out.println(stu2.a+" "+stu2.c);
		}
		in.close();
	}
} 
class Student{
	String a;
	int b;
	int c;
	public Student(String a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
}
