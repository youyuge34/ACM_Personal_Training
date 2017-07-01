import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

//先来先服务FCFS和短作业优先SJF进程调度算法
public class Main {

	// 声明变量
	// 允许的最大进程数
	public static int MaxNum = 100;
	// 真正的进程数
	public static int realNum;
	// 当前时间
	public static int NowTime;
	// 各进程的达到时间
	public static int ArrivalTime[] = new int[MaxNum];
	// 各进程的服务时间
	public static int ServiceTime[] = new int[MaxNum];
	// 各进程的服务时间(用于SJF中的临时数组)
	public static int ServiceTime_SJF[] = new int[MaxNum];
	// 各进程的完成时间
	public static int FinishTime[] = new int[MaxNum];
	// 各进程的周转时间
	public static int WholeTime[] = new int[MaxNum];
	// 各进程的带权周转时间
	public static double WeightWholeTime[] = new double[MaxNum];
	// FCFS和SJF的平均周转时间
	public static double AverageWT_FCFS, AverageWT_SJF;
	// FCFS和SJF的平均带权周转时间
	public static double AverageWWT_FCFS, AverageWWT_SJF;
	// FCFS中的周转时间总和
	public static int SumWT_FCFS = 0;
	// FCFS中的带权周转时间总和
	public static double SumWWT_FCFS = 0;
	// SJF中的周转时间总和
	public static int SumWT_SJF = 0;
	// SJF中的带权周转时间总和
	public static double SumWWT_SJF = 0;
	public static Scanner stdin;

	public static void main(String args[]) throws FileNotFoundException {

		// 从文件中输入数据
		
		Scanner stdin = new Scanner(System.in);
		System.out.println("B14111818 尤晟");
		int choice = stdin.nextInt(); // 算法选择：FCFS-“1”，选SJF-“2”
		realNum = stdin.nextInt(); //真实进程数
		for (int i = 0; i < realNum; i++) { //各进程的到达时间
			ArrivalTime[i] = stdin.nextInt(); 
		}
		for (int j = 0; j < realNum; j++) { //各进程的服务时间
			ServiceTime[j] = stdin.nextInt();
			ServiceTime_SJF[j] = ServiceTime[j];
		}
		stdin.close();

		// 算法选择：1-FCFS，2-SJF；
		if (choice == 1) {
			FCFS();
		} else if (choice == 2) {
			SJF();
		} else {
			System.out.println("算法选择错误");
		}
	}

	//先来先服务FCFS进程调度算法
	public static void FCFS() {

		// 到达时间的冒泡排序，完成时间随之变动（使先到者排在前面，后到者排在后面）
		sort();

		// 计算每个进程的完成时间、周转时间、带权周转时间、所有进程的平均周转时间以及带权平均周转时间
		FinishTime[0] = ArrivalTime[0] + ServiceTime[0];
		WholeTime[0] = ServiceTime[0];
		WeightWholeTime[0] = (double) WholeTime[0] / ServiceTime[0];
		AverageWT_FCFS = AverageWWT_FCFS = 0;
		AverageWT_FCFS = AverageWT_FCFS + WholeTime[0];
		AverageWWT_FCFS = AverageWWT_FCFS + WeightWholeTime[0];
		for (int j = 1; j < realNum; j++) {  //从第二个进程开始计算完成时间、周转时间、带权周转时间
			if (ArrivalTime[j] > FinishTime[j-1]) {  //该进程是否在等待
				FinishTime[j] = ArrivalTime[j] + ServiceTime[j];
				WholeTime[j] = ServiceTime[j];
			} else {  //该进程已在等待
				FinishTime[j] = FinishTime[j-1] + ServiceTime[j];
				WholeTime[j] = FinishTime[j-1] - ArrivalTime[j] + ServiceTime[j];
			}
			WeightWholeTime[j] = (double)WholeTime[j] / ServiceTime[j];
			
		}
		for (int i = 0; i < realNum; i++) {  //计算总周转时间、总带权周转时间
			SumWT_FCFS = SumWT_FCFS + WholeTime[i];  
			SumWWT_FCFS = SumWWT_FCFS + WeightWholeTime[i];
		}
		AverageWT_FCFS = (double)SumWT_FCFS / realNum; //平均周转时间
		AverageWWT_FCFS = (double)SumWWT_FCFS / realNum; //平均带权周转时间
		
		// 输出每个进程的完成时间、周转时间、带权周转时间、所有进程的平均周转时间以及带权平均周转时间
		outPUT(1);
	}

	//短作业优先SJF进程调度算法
	public static void SJF() {
		
		// 到达时间的冒泡排序，完成时间随之变动（使先到者排在前面，后到者排在后面）
		sort();
		
		int min = 0;
		NowTime = ArrivalTime[0] + ServiceTime[0];// 计算第一次的NowTIme
		FinishTime[0] = ServiceTime[0];// 计算第一个进程的完成时间
		ServiceTime_SJF[0]=1000;//赋初值。
		int allin = 0, j, k;
		for (int i = 1; i < realNum; i++)// 进入循环，从第二个到达的进程开始
		{
			k = 1;
			min = 0;
			if (allin == 0)// 找到已经到达的进程个数
			{
				for (j = 0; ArrivalTime[j] <= NowTime && j < realNum ; j++) {
					if (j >= realNum) {
						allin = 1;
					}
				}		
			} else {
				j = realNum;
			}
			j = j - 1;// j是已经到达的进程数（减去已经计算过的第一个进程）
			
			while (k <= j)// 从已经到达的进程里找到服务时间最短的进程
			{
				if(ServiceTime_SJF[k]==0)//进程的服务时间如果等于0，则跳过该进程
					k++;
				else
				{
					if(ServiceTime_SJF[min]>ServiceTime_SJF[k])//比较，找到服务时间最短的进程
						min=k;
					k++;
				}
	
			}
			ServiceTime_SJF[min] = 0;// 找完后置零，便于下一次循环时跳过
			NowTime += ServiceTime[min];// 累加当前时间
			FinishTime[min] = NowTime;// 完成时间
		}
		
		for (int i = 0; i < realNum; i++)// 计算周转时间，带权周转时间，总的周转时间和总的带权周转时间
		{
			WholeTime[i] = FinishTime[i] - ArrivalTime[i];
			WeightWholeTime[i] = (double)WholeTime[i] / ServiceTime[i];
			SumWT_SJF += WholeTime[i];
			SumWWT_SJF += WeightWholeTime[i];
		}
		AverageWT_SJF = (double)SumWT_SJF / realNum;// 平均周转时间
		AverageWWT_SJF = (double)SumWWT_SJF / realNum;// 平均带权周转时间

		// 输出每个进程的完成时间、周转时间、带权周转时间、所有进程的平均周转时间以及带权平均周转时间
		outPUT(2);
	}

	// 到达时间的冒泡排序，完成时间随之变动（使先到者排在前面，后到者排在后面）
	public static void sort() {
		int temp1 = 0;
		int temp2 = 0;
		for (int i = 0; i < realNum - 1; i++) {
			for (int j = 0; j < realNum - 1; j++) {
				if (ArrivalTime[j] > ArrivalTime[j + 1]) {
					temp1 = ArrivalTime[j];
					temp2 = ServiceTime[j];
					ArrivalTime[j] = ArrivalTime[j + 1];
					ServiceTime[j] = ServiceTime[j + 1];
					ArrivalTime[j + 1] = temp1;
					ServiceTime[j + 1] = temp2;
				}
			}
		}
	}

	// 输出每个进程的完成时间、周转时间、带权周转时间、所有进程的平均周转时间以及带权平均周转时间
	// a=1:输出FCFS结果          a=2:输出SJF结果
	public static void outPUT(int a) {
		int k;
		DecimalFormat format = new DecimalFormat("#.00");
		System.out.print("到达时间        :");
		for (k = 0; k < realNum; k++) {
			System.out.print(ArrivalTime[k] + "  ");
		}
		System.out.println("");
		System.out.print("服务时间        :");
		for (k = 0; k < realNum; k++) {
			System.out.print(ServiceTime[k] + "  ");
		}
		System.out.println("");
		System.out.print("完成时间        :");
		for (k = 0; k < realNum; k++) {
			System.out.print(FinishTime[k] + "  ");
		}
		System.out.println("");
		System.out.print("周转时间        :");
		for (k = 0; k < realNum; k++) {
			System.out.print(WholeTime[k] + "  ");
		}
		System.out.println("");
		System.out.print("带权周转时间:");
		for (k = 0; k < realNum; k++) {
			System.out.print(format.format(WeightWholeTime[k]) + "  ");
		}
		System.out.println("");
		
		if(a==1){
			System.out.println("平均周转时间        :" + format.format(AverageWT_FCFS));
			System.out.println("平均带权周转时间:" + format.format(AverageWWT_FCFS));
		}else{
			System.out.println("平均周转时间        :" + format.format(AverageWT_SJF));
			System.out.println("平均带权周转时间:" + format.format(AverageWWT_SJF));
		}
	
		// 模拟整个调度过程，输出每个时刻的进程运行状态
		System.out.println("时刻" + ArrivalTime[0] + ":进程" + 1 + "开始运行");
		for (int i = 1; i < realNum; i++) {
			System.out.println("时刻" + FinishTime[i - 1] + ":进程" + (i + 1)
					+ "开始运行");
		}
	}

}


