import java.util.*;
 
public class Main2 {
 
    static int[] monLen = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
 
    static class Date{
        int year;
        int mon;
        int day;
 
        Date(int y,int m,int d){
            year = y;
            mon = m;
            day = d;
        }
    }
 
    public static boolean isLeap(int y){
        return ((isExact(y,4)&&!isExact(y,100)) || isExact(y,400)) ? true : false;
    }
 
    public static boolean isExact(int a,int b){
        return (a+0f)/b == (a/b)+0f ? true : false;
    }
 
    public static boolean isAfter(Date d1, Date d2){
        if(d1.year > d2.year){ return true; }
        else if(d1.year < d2.year){return false;}
 
        if(d1.mon > d2.mon){return true;}
        else if(d1.mon < d2.mon){return false;}
 
        if(d1.day >= d2.day){ return true;}
        else if(d1.day < d2.day){ return false;}
 
        return false;
    }
 
    public static int getAllDays(Date d1, Date d2, int leapYears){
        int sum = 0;
        if(d1.year == d2.year){
            if(d1.mon == d2.mon){
                sum = d2.day - d1.day;
            }else{
                for(int i=d1.mon+1; i<d2.mon ;i++){
                    sum += monLen[i-1];
                }
                sum += Math.max((monLen[d1.mon-1] - d1.day),0) + (d2.day - 0);
            }
            sum += leapYears;
        }else{
            for(int i=d1.mon+1; i<=12 ;i++){
                sum += monLen[i-1];
            }
            sum += Math.max((monLen[d1.mon-1] - d1.day),0);
            for(int i=1; i<d2.mon; i++){
                sum += monLen[i-1];
            }
            sum += d2.day;
            sum += leapYears + (d2.year - d1.year - 1)*365;
        }
        return sum ;
    }
 
    public static int getLeapYears(Date d1, Date d2){
        int leapYears = 0;
        Date leapDay1 = new Date(d1.year,2,29);
        Date leapDay2 = new Date(d2.year,2,29);
        for(int i=d1.year;i<=d2.year;i++){
            if(isLeap(i)){leapYears++;}
        }
        if(isLeap(d1.year) && isAfter(d1,leapDay1)) leapYears--;
        if(isLeap(d2.year) && isAfter(leapDay2,d2)) leapYears--;
        return leapYears;
 
 
    }
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
 
        while(in.hasNext()){
            String d1 = in.next();
            Date date1 = new Date(Integer.parseInt(d1.substring(0,4)),Integer.parseInt(d1.substring(4,6)),Integer.parseInt(d1.substring(6,8)));
            String d2 = in.next();
            Date date2 = new Date(Integer.parseInt(d2.substring(0,4)),Integer.parseInt(d2.substring(4,6)),Integer.parseInt(d2.substring(6,8)));
 
            int leapYears = isAfter(date1,date2) ? getLeapYears(date2,date1) : getLeapYears(date1, date2);
            int allDays = isAfter(date1,date2) ? getAllDays(date2,date1,leapYears) : getAllDays(date1,date2,leapYears);
            System.out.println(allDays+1);
 
        }
    }
}