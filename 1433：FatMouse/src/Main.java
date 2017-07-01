import java.util.Arrays;
import java.util.Scanner;

class food implements Comparable<food>{
	int bean;
	int cat;
	public food(int bean, int cat) {
		super();
		this.bean = bean;
		this.cat = cat;
	}
	@Override
	public int compareTo(food o) {
		double cha = bean*1.0/cat - o.bean*1.0/o.cat;
		int c;
		if(cha<0){
			c=-1;
		}else if(cha == 0){
			c=0;
		}else c=1;
		return -c;
	}
	
	
}

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m =0;
		int n =0;
		while ((m=in.nextInt())!=-1&&(n=in.nextInt())!=-1) {
			food[] list = new food[n];
			for (int i = 0; i < n; i++) {
				list[i]= new food(in.nextInt(),in.nextInt());
			}
			Arrays.sort(list);
			
			double out =0;
//			int j =0;
			for (int i = 0; i < n; i++) {
				if(m>list[i].cat){
//					System.out.println(list[i].bean);
					out+=list[i].bean;
					m-=list[i].cat;
				}else{
					out+=1.0*m/list[i].cat*list[i].bean;
					break;
				}
			}
			
			
			System.out.printf("%.3f\n",out);
			
		}
	}

}
