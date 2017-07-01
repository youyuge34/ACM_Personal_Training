package 养兔子;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
	    long[] c= new long[82];
	    c[1]=1;
	    c[2]=1;
	    for(int i=3;i<=81;i++){
	    	c[i]=c[i-1]+c[i-2];
	    }
	    while(in.hasNextInt()){
	    	int n=in.nextInt();
	    	int m=in.nextInt();
	    	long sum=0;
	    	for(int i=n;i<=m;i++){
	    		sum+=c[i];
	    	}
	    	System.out.println(sum);
	    }
	}

}
