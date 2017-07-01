import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] months = {
				"January",
				"February",
				"March",
				"April",
				"May",
				"June",
				"July",
				"August",
				"September",
				"October",
				"November",
				"December"
		};
		String[] weekdays ={
				"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday",
				"Saturday",
		};
		Scanner in =new Scanner(System.in);
		while(in.hasNext()){
			int date = in.nextInt();
			int month = 0;
			String temp = in.next();
			for (int i = 0; i < months.length; i++) {
				if(temp.equals(months[i])){
					month = i;
					break;
				}
			}
			
			int year = in.nextInt();
			Calendar cal = GregorianCalendar.getInstance();
			cal.set(year, month,date);
			System.out.println(weekdays[cal.get(Calendar.DAY_OF_WEEK)-1]);
		}
	}

}
