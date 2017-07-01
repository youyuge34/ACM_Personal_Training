//这一题很好的体现了Java中类的思想，代码看起来简洁明了。
//况且直接调用collections.sort（优化快排）能节省大量代码工作以及运行时间。
 
//思路很简单：因为每组grade不同，所以让grade作为map里的key，类stu为value。
//只要对key进行排序，之后取出key对应的类中的name和id即可。
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class stu{
	String name;
	String id;
	public stu(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
}
public class Main {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		HashMap<Integer,stu> map=new HashMap<Integer,stu>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			String name=in.next();
			String id=in.next();
			int grade=in.nextInt();
			map.put(grade,new stu(name,id));
			list.add(grade);
		}
		int min=in.nextInt();
		int max=in.nextInt();
		int count=0;
		Collections.sort(list);
		for(int i=n-1;i>=0;i--){
			int grade=list.get(i);
			if(grade>=min&&grade<=max){
				count++;
			stu s=map.get(grade);
			System.out.println(s.name+" "+s.id);
		}
		}
		if(count==0){
			System.out.println("NONE");
		}
	}

}
