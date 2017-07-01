package 锤子剪刀布;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Main2{
 
    public static void main(String[] args) throws IOException {
        BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
        //先将数据读出，并存入容器中，但因为容器长度不固定，因此考虑用StringBuilder和集合框架
        //集合框架：由于可能出现重复的现象，因此用list集合
        String len=null;
        int count=0;
        int count1=-99;
        int win = 0,lose = 0,draw=0;
        int[] result=new int[6];
        while((len=bfr.readLine())!=null){
            len=len.trim();
            if(count==0){
        //读取第一行共有多少测试样例可用来作为结束标记，防止阻塞式方法阻塞。
                count1=Integer.parseInt(len);
                count++;
            }else{
                count++;
                String[] str=len.split("\\s");
//              System.out.println(str[0]+"----------"+str[1]);
//              System.out.println(judge(str[0],str[1],result));
                switch(judge(str[0],str[1],result)){
                case 1:
                    win++;
//                  System.out.println("win"+win);
                    break;
                case 0:
                    draw++;
//                  System.out.println("draw"+draw);
                    break;
                case -1:
                    lose++;
//                  System.out.println("lose"+lose);
                    break;
                }
            }
            if(count==count1+1)
                break;
        }
        //统计双方出什么赢的概率最大。
        String sA=getMax(result[0],result[1],result[2]);
        String sB=getMax(result[3],result[4],result[5]);
        //将结果输出
        System.out.println(win+" "+draw+" "+lose);
        System.out.println(lose+" "+draw+" "+win);
        System.out.println(sA+" "+sB);
        bfr.close();
    }
 
    public static String getMax(int i, int j, int k) {
        String max;
        if(i-j>=0){
            if(i>=k){
                max="B";
            }else{
                max="J";
            }
        }else{
            if(j>=k){
                max="C";
            }else{
                max="J";
            }
        }
        return max;
    }
 
    public static char compare(String s) {
        char[] ch=s.toCharArray();
        int[] count=new int[3];
        for(char c:ch){
            if(c=='C')
                count[0]++;
            else if(c=='J')
                count[1]++;
            else
                count[2]++;
        }
        Arrays.sort(count);
        return 0;
    }
 
    public static int judge(String s1, String s2, int[] result) {
        //注意这里C>J，J>B,B>C，
        if(s1.equals("C")){
            if(s2.equals("J")){
                result[1]++;
                return 1;                
            }else if(s2.equals("B")){
                result[3]++;
                return -1;
            }else{
                return 0;             
            }
        }else if(s1.equals("J")){
            if(s2.equals("B")){
                result[2]++;
                return 1;
            }else if(s2.equals("C")){
                result[4]++;
                return -1;
            }else{
                return 0;             
            }
        }else{
            if(s2.equals("C")){
                result[0]++;
                return 1;
            }else if(s2.equals("J")){
                result[5]++;
                return -1;
            }else{
                return 0;             
            }
        }
         
    }
 
}