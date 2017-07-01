import java.util.Scanner;

public class circular {

	public static void main(String[] args) {
		String s1="";
		Scanner in= new Scanner(System.in);
		int t=in.nextInt();
		in.nextLine();   //之后加一个nextLine（）语句，将被nextint（）之后按的换行回车过滤掉
		for(int q=0;q<t;q++){
			String s=in.nextLine();
			char[] c=s.toCharArray();
			int n=s.length();
			char[] c1 = new char[100];
			int ans=0;
			
			for(int i=0;i<n;i++){
				Boolean f=false;
				for(int j=0;j<n;j++){
					if (c[(ans+j)%n]>c[(i+j)%n]){
						f=true;
						break;
					}
					
					if (c[(ans+j)%n]<c[(i+j)%n]){
						break;
					}
				}
					if(f){
						ans=i;
					}
				
			}
				
			for(int p=0;p<n;p++){
				s1+=c[(p+ans)%n];
			}
			s1+="\n";
		}
		System.out.println(s1);
		
	}

}
