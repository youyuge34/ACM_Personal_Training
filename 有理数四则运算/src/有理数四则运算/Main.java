package 有理数四则运算;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] a = in.next().split("/");
        String[] b = in.next().split("/");
        int afz = Integer.parseInt(a[0]);
        int afm = Integer.parseInt(a[1]);
        int bfz = Integer.parseInt(b[0]);
        int bfm = Integer.parseInt(b[1]);
        String left = convert(afz, afm);
        String right = convert(bfz, bfm);
        System.out.println(left+" + "+right+" = "+getNum(afz, afm, bfz, bfm, "+"));
        System.out.println(left+" - "+right+" = "+getNum(afz, afm, bfz, bfm, "-"));
        System.out.println(left+" * "+right+" = "+getNum(afz, afm, bfz, bfm, "*"));
        System.out.println(left+" / "+right+" = "+getNum(afz, afm, bfz, bfm, "/"));
    }
    private static String convert(int fz,int fm){
        if(fz==0)
            return "0";
        if(fm==0)
            return "Inf";
        StringBuilder result = new StringBuilder();
        boolean flag = false;
        int k = 0;
        if(fz<0){
            result.append("(-");
            fz = -fz;
            flag = true;
        }
        k = fz/fm;
        fz = fz%fm;
        if(fz==0){
            if(k!=0)
                result.append(k);
            if(!flag)
                return result.toString();
            else
                return result.append(")").toString();
        }
        int gcd = gcd(fz, fm);
        if(gcd!=1){
            fz /= gcd;
            fm /= gcd;
        }
        if(k!=0)
            result.append(k).append(" ");
        result.append(fz).append("/").append(fm);
        if(flag)
            result.append(")");
        return result.toString();
    }
    private static String getNum(int afz,int afm,int bfz,int bfm,String op){
        switch (op) {
        case "+":
            if(afm==bfm)
                return convert(afz+bfz, afm);
            else{
                int gcd = gcd(afm, bfm);
                int fm = afm*bfm/gcd;
                afz *= fm/afm;
                bfz *= fm/bfm;
                return convert(afz+bfz, fm);
            }
        case "-":
            if(afm==bfm)
                return convert(afz-bfz, afm);
            else{
                int gcd = gcd(afm, bfm);
                int fm = afm*bfm/gcd;
                afz *= fm/afm;
                bfz *= fm/bfm;
                return convert(afz-bfz, fm);
            }
        case "*":
            return convert(afz*bfz,afm*bfm);
        case "/":
            int fm = bfz*afm;
            int fz = afz*bfm;
            if(fm<0){
                fm = -fm;
                fz = -fz;
            }
            return convert(fz,fm);
        default:
            break;
        }
        return null;
    }
    private static int gcd(int a,int b){
        while(a%b!=0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return b;//最大公因数
    }
}