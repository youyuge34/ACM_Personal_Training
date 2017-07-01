import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String s[]=bf.readLine().split("\\s");
		bf.close();
//		int max=Math.max(s[0].length(),s[1].length());
		int a=s[0].length()-1;
		int b=s[1].length()-1;
		char c[]=s[0].toCharArray();
		char d[]=s[1].toCharArray();
		int count=1;
		StringBuffer sb=new StringBuffer("");
		while(a>=0&&b>=0){
			if(count%2==0){
				int ans=(int)d[b]-(int)c[a];
					sb.append(ans<0?(ans+10):ans);
			}else {
				int mod=((d[b]-'0')+(c[a]-'0'))%13;
				if(mod<=9){
					sb.append(mod);
				}else{
				switch(mod){
				case 10:sb.append("J");break;
				case 11:sb.append("Q");break;
				case 12:sb.append("K");break;
				}}
			}
			a--;b--;count++;
		}
		while(a>=0){
			sb.append(c[a]-'0');
			a--;
		}
		while(b>=0){
			sb.append(d[b]-'0');
			b--;
		}
		System.out.println(sb.reverse());
	}

}
