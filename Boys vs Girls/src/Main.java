import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class stu{
	String name;
	String sex;
	String id;
	int grade;
	public stu(String name, String sex, String id, int grade) {
		super();
		this.name = name;
		this.sex = sex;
		this.id = id;
		this.grade = grade;
	}
}

public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		ArrayList<Integer> boys=new ArrayList<Integer>();
		ArrayList<Integer> girls=new ArrayList<Integer>();
		HashMap<Integer,stu> map=new HashMap<Integer,stu>();
		for(int i=0;i<n;i++){
			String name=in.next();
			String sex=in.next();
			String id=in.next();
			int grade=in.nextInt();
			stu s=new stu(name, sex, id, grade);
			map.put(grade,s);
			if(sex.equals("M")){
				boys.add(grade);
			}else girls.add(grade);
		}
		Collections.sort(boys);
		Collections.sort(girls);
		
		int max=0;
		int min = 0;
		if(girls.isEmpty()){
			System.out.println("Absent");
		}else{
			stu girl=map.get(girls.get(girls.size()-1));
			System.out.println(girl.name+" "+girl.id);
			max=girl.grade;
		}
		if(boys.isEmpty()){
			System.out.println("Absent");
		}else{
			stu boy=map.get(boys.get(0));
			System.out.println(boy.name+" "+boy.id);
			min=boy.grade;
		}
		if(boys.isEmpty()||girls.isEmpty()){
			System.out.println("NA");
		}else{
			System.out.println(max-min);
		}
		
	}
	
}
