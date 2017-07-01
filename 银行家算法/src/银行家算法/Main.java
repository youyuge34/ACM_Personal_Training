package 银行家算法;
import javax.swing.*;
/*一共有５个进程需要请求资源，有３类资源*/  
public class Main {  
    // 每个进程所需要的最大资源数  
    public static int MAX[][] = { { 7, 5, 3 }, { 3, 2, 2 }, { 9, 0, 2 },  
            { 2, 2, 2 }, { 4, 3, 3 } };  
    // 系统拥有的初始资源数  
    public static int AVAILABLE[] = { 12, 6, 7 };  
    // 系统已给每个进程分配的资源数  
    public static int ALLOCATION[][] = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 },  
            { 0, 0, 0 }, { 0, 0, 0 } };  
    // 每个进程还需要的资源数  
    public static int NEED[][] = { { 7, 5, 3 }, { 3, 2, 2 }, { 9, 0, 2 },  
            { 2, 2, 2 }, { 4, 3, 3 } };  
    // 每次申请的资源数  
    public static int Request[] = { 0, 0, 0 };  
    // 进程数与资源数  
    public static int M = 5, N = 3;  
    int FALSE = 0;  
    int TRUE = 1;  
    public void showdata() {  
        int i, j;  
        System.out.println("系统可用的资源数为:");  
        for (j = 0; j < N; j++) {  
            System.out.print("资源" + j + ":" + AVAILABLE[j] + " ");  
        }  
        System.out.println();  
        System.out.println("各进程还需要的资源量:");  
        for (i = 0; i < M; i++) {  
            System.out.print("进程" + i + ":");  
            for (j = 0; j < N; j++) {  
                System.out.print("资源" + j + ":" + NEED[i][j] + " ");  
            }  
            System.out.println();  
        }  
        System.out.print("各进程已经得到的资源量: \n");  
        for (i = 0; i < M; i++) {  
            System.out.print("进程");  
            System.out.print(i);  
            for (j = 0; j < N; j++) {  
                System.out.print("资源" + j + ":" + ALLOCATION[i][j] + " ");  
            }  
            System.out.println();  
        }  
    }  
    // 分配资源，并重新更新各种状态  
    public void changdata(int k) {  
        int j;  
        for (j = 0; j < N; j++) {  
            AVAILABLE[j] = AVAILABLE[j] - Request[j];  
            ALLOCATION[k][j] = ALLOCATION[k][j] + Request[j];  
            NEED[k][j] = NEED[k][j] - Request[j];  
        }  
    };  
    // 回收资源，并重新更新各种状态  
    public void rstordata(int k) {  
        int j;  
        for (j = 0; j < N; j++) {  
            AVAILABLE[j] = AVAILABLE[j] + Request[j];  
            ALLOCATION[k][j] = ALLOCATION[k][j] - Request[j];  
            NEED[k][j] = NEED[k][j] + Request[j];  
        }  
    };  
    // 释放资源  
    public void free(int k) {  
        for (int j = 0; j < N; j++) {  
            AVAILABLE[j] = AVAILABLE[j] + ALLOCATION[k][j];  
            System.out.println("释放" + k + "号进程的" + j + "资源!");  
        }  
    }  
    public int check0(int k) {  
        int j, n = 0;  
        for (j = 0; j < N; j++) {  
            if (NEED[k][j] == 0)  
                n++;  
        }  
        if (n == 3)  
            return 1;  
        else  
            return 0;  
    }  
    // 检查安全性函数  
    public int chkerr(int s) {  
        int WORK;  
        int FINISH[] = new int[M], temp[] = new int[M];// 保存临时的安全进程序列  
        int i, j, k = 0;  
        for (i = 0; i < M; i++)  
            FINISH[i] = FALSE;  
        for (j = 0; j < N; j++) {  
            WORK = AVAILABLE[j]; // 第j个资源可用数  
            i = s;  
            // 判断第i个进程是否满足条件  
            while (i < M) {  
                if (FINISH[i] == FALSE && NEED[i][j] <= WORK) {  
                    WORK = WORK + ALLOCATION[i][j];  
                    FINISH[i] = TRUE;  
                    temp[k] = i;  
                    k++;  
                    i = 0;  
                } else {  
                    i++;  
                }  
            }  
            for (i = 0; i < M; i++)  
                if (FINISH[i] == FALSE) {  
                    System.out.println("系统不安全!!! 本次资源申请不成功!");  
                    return 1;  
                }  
        }  
        System.out.print("\n经安全性检查，系统安全，本次分配成功。\n");  
        System.out.print("本次安全序列：");  
        for (i = 0; i < M - 1; i++) {  
            System.out.print("进程" + temp[i] + "->");  
        }  
        System.out.print("进程" + temp[M - 1]);  
        System.out.println();  
        return 0;  
    }  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {
    	System.out.println("B14111818 尤晟");
        int i = 0, j = 0;  
        int flag = 1;  
        Main bank = new Main();  
        bank.showdata();  
        while (flag == 1) {  
            i = -1;  
            while (i < 0 || i >= M) {  
                String str = JOptionPane.showInputDialog("请输入需申请资源的进程号（从0到"  
                        + (M - 1) + "，否则重输入!）");  
                i = Integer.parseInt(str);  
                if (i < 0 || i >= M)  
                    System.out.println("输入的进程号不存在，重新输入!\n");  
            }  
            System.out.print("请输入进程" + i + "申请的资源数\n");  
            for (j = 0; j < N; j++) {  
                String str = JOptionPane.showInputDialog("资源" + j + ":");  
                Request[j] = Integer.parseInt(str);  
                if (Request[j] > NEED[i][j]) {  
                    System.out.print("进程" + i + "申请的资源数大于进程" + i + "还需要" + j  
                            + "类资源的资源量!申请不合理，出错!请重新选择!\n");  
                    flag = 0;  
                    break;  
                } else {  
                    if (Request[j] > AVAILABLE[j]) {  
                        System.out.print("进程" + i + "申请的资源数大于系统可用" + j  
                                + "类资源的资源量!申请不合理，出错!请重新选择!\n");  
                        flag = 0;  
                        break;  
                    }  
                }  
            }  
            if (flag == 1) {  
                bank.changdata(i);  
                int chkerr = bank.chkerr(i);  
                if (chkerr == 1) {  
                    bank.rstordata(i);  
                    bank.showdata();  
                } else {  
                    bank.showdata();  
                    int check = bank.check0(i);  
                    if (check == 1) {  
                        System.out.print("进程" + i + "已经完成，系统将其所占用资源释放\n");  
                        bank.free(i);  
                    }                     
                }  
            } else {  
                bank.showdata();  
            }  
            System.out.println("\n");  
            String str = JOptionPane  
                    .showInputDialog("是否继续银行家算法演示,按'1'键继续,按'0'键退出演示");  
            flag = Integer.parseInt(str);  
        }  
    }  
}  
