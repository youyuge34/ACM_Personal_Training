import java.io.FileInputStream;
import java.util.Scanner;

public class hanxin {

	public static void main(String[] args) {
		int count=0;
		int i;
		Scanner in=new Scanner(System.in);
		try{in=new Scanner(new FileInputStream("data.in"));}catch(Exception e){}
		
		while (in.hasNext()){
		int	a = in.nextInt();
		int	b = in.nextInt();
		int	c = in.nextInt();
		for(i=10;i<101;i++){
			if((i%3==a)&&(i%5==b)&&(i%7)==c ){
				break;
			}
		}
			count++;
			if(i==101){
			System.out.println("Case "+count+": No answer");
		}
			else{
				System.out.println("Case "+count+": "+i);
			}
		
		
		}
in.close();
	}}
