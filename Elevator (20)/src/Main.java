import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n+1];
		int time=0;
		a[0]=0;
		for(int i=1;i<n+1;i++){
			a[i]=in.nextInt();
			int cha=a[i]-a[i-1];
			time+=cha>0?cha*6:-cha*4;
			time+=5;
		}System.out.println(time);
	}

}
