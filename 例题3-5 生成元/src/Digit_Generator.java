import java.util.Scanner;

public class Digit_Generator {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s="";
		while(in.hasNext()){
			int y=in.nextInt();
			int i;
			if (y==0) break;
			else{
			for( i=1;i<y;i++){
				int k=i;
				int j=0;
					do{j+=k%10;
					k/=10;
					}while(k!=0);
			if (j+i==y){
				s+=i+"\n";
				break;}
			}if(i==y){
				s+="0\n";
			}
			}
		}
		System.out.println(s);
	}

}
