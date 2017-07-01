import java.util.Scanner;

public class UVa1586 {

	public static void main(String[] args) {
		double sum=0;
		Scanner in= new Scanner(System.in);
		String s=in.nextLine();
		char[] c= s.toCharArray();
		for (int i=0;i<s.length()-1;i++){
			int c1=0;
			if(c[i]>'9'||c[i]<'0'){
				if(c[i+1]>'9'||c[i+1]<'0'){
					c1=1;
				}else{
				for(int j=i+1;j<s.length()&&'0'<=c[j]&&c[j]<='9';j++){
					 c1=c1*10+(c[j]-'0');
//					 System.out.println(c1);
				}
				}
			}
			switch (c[i]){
				case 'C':
					sum+=c1*12.01;
					break;
				case 'N':
					sum+=c1*14.01;
					break;
				case 'O':
					sum+=c1*16;
					break;
				case 'H':
					sum+=c1*1.008;
					break;
			}
//			System.out.println(sum);
		}
		int n=s.length()-1;
		switch (c[n]){
		case 'C':
			sum+=12.01;
			break;
		case 'N':
			sum+=14.01;
			break;
		case 'O':
			sum+=16;
			break;
		case 'H':
			sum+=1.008;
			break;
	}
		System.out.println(sum);
	}

}
