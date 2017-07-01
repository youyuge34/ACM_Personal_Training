
public class permutation {

	public static void main(String[] args) {
		for(int i=111;i<=329;i++){
			Boolean t=true;
			int j=2*i;
			int k=3*i;

			int a[]=new int[9];
			a[0]=i/100;
			a[1]=i/10%10;
			a[2]=i%10;
			
			a[3]=j/100;
			a[4]=j/10%10;
			a[5]=j%10;
			a[6]=k/100;
			a[7]=k/10%10;
			a[8]=k%10;
			
			for(int m=1;m<=9;m++){
				if(a[m-1]==0){
					t=false;
				}
				for(int n=m+1;n<=9;n++){
					if(a[m-1]==a[n-1]){
						t=false;
					}
					
					
				}
			}
			if(t){
				System.out.println(""+a[0]+a[1]+a[2]+" "+a[3]+a[4]+a[5]+" "+a[6]+a[7]+a[8]);
			}
		}
	}

}
