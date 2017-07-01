import java.util.*;
public class test1 {

	public static void main(String[] args) {

		Calendar cal=Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		
		cal.add(Calendar.MINUTE, 20);
		Date date=cal.getTime();
		System.out.println(date);
		System.out.println(cal.get(Calendar.MINUTE));
		cal.set(2017, 2, 11,10,10,12);
		System.out.println(cal.get(Calendar.SECOND));
		Calendar cal2=Calendar.getInstance();
		cal2.set(Calendar.YEAR, 2000);
		System.out.println(cal2.get(Calendar.YEAR));
		
	}

}
