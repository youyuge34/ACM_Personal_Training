package 正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test1 {

	public static void main(String[] args) {
		// 按指定模式在字符串查找
	      String line = "QT3000!!222r";
	      String pattern = "(\\d{3,4})r";

	      // 创建 Pattern 对象
	      Pattern r = Pattern.compile(pattern);

	      // 现在创建 matcher 对象
	      Matcher m = r.matcher(line);
	      System.out.println(m.groupCount());
	      while (m.find()) {
//	         System.out.println("Found value: " + m.group(0) );
//	         System.out.println("Found value: " + m.group(1) );
	         System.out.println("Found value: " + m.group() );
//	         System.out.println("Found value: " + m.group(3) );
	      } 
//	         else {
//	         System.out.println("NO MATCH");
//	      }
		
	}

}
