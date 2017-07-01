import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		float c[][]=new float[3][3];
		int imax=0;
		int jmax=0;
		int kmax=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				c[i][j]=in.nextFloat();
			}
		}
		double max=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					double temp=(c[0][i]*c[1][j]*c[2][k]*0.65-1)*2;
					if(temp>max){
						max=temp;
						imax=i;
						jmax=j;
						kmax=k;
					}
					
				}
			}
			
		}String s[]={"W","T","L"};
		DecimalFormat f=new DecimalFormat("0.00");
		System.out.println(s[imax]+" "+s[jmax]+" "+s[kmax]+" "+f.format(max));
		
	}

}
