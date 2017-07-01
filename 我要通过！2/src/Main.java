import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++){
			int counta=0;
			int countp=0;
			int countt=0;
			int p=0;
			int t=0;
			String s=in.next();
			for(int j=0;j<s.length();j++){
				if(s.charAt(j)=='A'){
					counta++;
				}else if(s.charAt(j)=='P'){
					p=j;
					countp++;
				}else if(s.charAt(j)=='T'){
					t=j;
					countt++;
				}
			}
//			System.out.println(counta+" "+countp+" "+countt+" "+p+" "+t);
			if(countp==1&&countt==1&&counta==(s.length()-2)&&p<t&&counta>0){
				if((s.length()-t-1)==(p*(t-1-p))){
					System.out.println("YES");
				} else System.out.println("NO");
			}else {
				System.out.println("NO");
			}
		}in.close();
	}

}
