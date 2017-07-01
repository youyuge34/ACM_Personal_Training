package 一元多项式求导;

import java.util.ArrayList;  
import java.util.Scanner;    
public class Main{    
    public static void main(String[] args){    
        Scanner sc = new Scanner(System.in);    
        String str = sc.nextLine();               
        String[]newStr = str.split("\\s+");             //切割字符串  
        ArrayList<Integer>alist = new ArrayList<Integer>();  
        for(int i=0 ;i<newStr.length ;i+=2){  
            int j=i+1;  
            if(Integer.valueOf(newStr[i])==0){              //常数项为0  
                alist.add(0);  
                alist.add(0);  
            }  
            if(Integer.valueOf(newStr[i])!=0&&Integer.valueOf(newStr[j])==0){   //指数为0且常数项不为0  
          
            }  
            if(Integer.valueOf(newStr[i])!=0&&Integer.valueOf(newStr[j])!=0){   //  常数项和指数项都不为0  
                alist.add(Integer.valueOf(newStr[i])*Integer.valueOf(newStr[j]));  
                alist.add(Integer.valueOf(newStr[j])-1);  
            }  
        }     
        if(alist.isEmpty()){            //如果将要输出的是空字符串，那么就输出0 0   
            System.out.println("0 0");  
        }else{  
            for(int i=0 ;i<alist.size() ;i++){  
                System.out.print(alist.get(i));  
                if(i!=alist.size()-1){    
                    System.out.print(" ");  //行末不能有空格  控制空格的输出  
                }  
            }  
            System.out.println();  
        }  
          
                  
    }  
}  