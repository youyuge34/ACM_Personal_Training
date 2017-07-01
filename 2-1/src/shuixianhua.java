
public class shuixianhua {

	public static void main(String[] args) {
		for(int i=100;i<=999;i++){
			int a= i/100;
			int b=i/10%10;
			int c=i%10;
			int sum=a*a*a+b*b*b+c*c*c;
//			System.out.println(a);
//			System.out.print(b);
//			System.out.print(c);
//			System.out.println(sum);
			if(sum==i){
				System.out.print(i+" ");
			}
			
		}

	}

}
