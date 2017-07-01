
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		int oldsum=a[0];    //前面所有数字的总和
		int start=0;        //序列第一个数字
		int maxstart=0;    //记录最大总和时候的开始数字
		int end=0;            //序列最末数字（同时也是最大总和时候的最末数字）
		int newsum;        //包含当前数字的新总和
		int maxsum=Integer.MIN_VALUE;    //用来记录最大总和
		for(int i=1;i<n;i++){
			if(oldsum<0){
				start=a[i];    //当前数字作为序列第一个数啦
				oldsum=0;    //所以之前的总和清0咯
			}
			newsum=oldsum+a[i];
			oldsum=newsum;      //下一次遍历时候的oldsum就是这次的newsum
			if(newsum>maxsum){      //更新并存储下最大和时候的数据
				maxsum=newsum;
				end=a[i];
				maxstart=start;
			}
		}if(maxsum<0){
			System.out.println(0+ " "+a[0]+" "+a[n-1]);
		}else
		System.out.println(maxsum+" "+maxstart+" "+end);
	}

}

