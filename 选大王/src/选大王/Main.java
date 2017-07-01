package 选大王;

import java.util.Scanner;

public class Main {

		
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			Boolean []c= new Boolean[10005];
			for(int i=0;i<10004;i++){
				c[i]=true;
			}
			int n=in.nextInt();
			int m=in.nextInt();
			int count=0;
			int i=1;
			int left=n;
			while(true){
				if(c[i%n]){
					count++;
					if(count%m==0){
						c[i%n]=false;
						left--;
						if(left==1){
							break;
						}
					}
				}
				i++;
			}
			if(c[0]){
				System.out.println(n);
			}else{
			for(int k=1;k<n;k++){
				if(c[k]){
					System.out.println(k);
				}
			}
		}}
	}

}
