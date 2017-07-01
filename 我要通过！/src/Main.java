import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=1;i<=n;i++){
			String s=in.next();
			char[] c=new char[104];
			c=s.toCharArray();
			Boolean f=true;
			int p=0; int t=0;
			int p1=0; int t1=0;
			for(int j=0;j<s.length();j++){
				if(c[j]=='A'){
					
				}else if(c[j]=='P'){
					p++;
					p1=j;
				}
				else if(c[j]=='T'){
					t++;
					t1=j;
				}else {
					System.out.println("NO");
					f=false;
					break;
				}
			}
			
				if(f){
					if(p!=1||t!=1){
						System.out.println("NO");
					}else	if((s.length()-1-t1)==p1*(t1-p1-1)&&(t1-p1-1)>0){
						System.out.println("YES");
					}else{
						System.out.println("NO");
					}
						
				}
		}
		in.close();
	}

}
