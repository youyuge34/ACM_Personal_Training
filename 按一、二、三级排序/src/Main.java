import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Mycom implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		if(o1.substring(0,3).compareTo(o2.substring(0,3))<0){
			return -1;
		}else if(o1.substring(0,3).compareTo(o2.substring(0,3))>0){
			return 1;
		}else {
			if(o1.substring(3,5).compareTo(o2.substring(3,5))>0){
				return -1;
			}else if(o1.substring(3,5).compareTo(o2.substring(3,5))<0){
				return 1;
			}else{
				if(o1.substring(5,8).compareTo(o2.substring(5,8))>0){
				return -1;
				}else if(o1.substring(5,8).compareTo(o2.substring(5,8))<0){
					return 1;
				}
				
			}
		}
		return 0;
	}
	
}
public class Main {
	
/** 请完成下面这个函数，实现题目要求的功能 **/
 /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static String process(String input) {
    	String s[]=input.split(",");
    	ArrayList<String> list=new ArrayList<>();
    	for(int i=0;i<s.length;i++){
    		list.add(s[i]);
    	}
    	StringBuilder sb=new StringBuilder();
    	Collections.sort(list,new Mycom());
    	for(int i=0;i<list.size();i++){
    		if(i==0){
    			sb.append(list.get(i));
    		}
    		else sb.append(","+list.get(i));
    	}
		return sb.toString().trim();


    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;
            
        String _input;
        try {
            _input = in.nextLine();
        } catch (Exception e) {
            _input = null;
        }
  
        res = process(_input);
        System.out.println(res);
    }

// 示例输入1
// 004HI090,004HI091,004HZ091,004KY026

// 示例输入2
// 004HI090,004HI091,004HZ091,004KY026,030HY018,007GY010,038QA066,004IE071,036PE075,029FA070,038NY002,024DV074,008VR058,008JK081,034GS085,020JH083,038HM003,035IJ091,027CB088,003PH003,039RE044,020CB082,029JX074,034JT078,012AO079,029BN015,013UK028,024MP012,018UX080,013AY033


}