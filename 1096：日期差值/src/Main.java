import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String date1 = null;
		String date2 = null;
		while ((date1 = bf.readLine()) != null) {
			date2 = bf.readLine();
			Calendar cal = GregorianCalendar.getInstance();
			int year1 = Integer.parseInt(date1.substring(0, 4));
			int month1 = Integer.parseInt(date1.substring(4, 6))-1;
			int day1 = Integer.parseInt(date1.substring(6, 8));
			cal.set(year1, month1,day1);
			long d1 = cal.getTimeInMillis();
			
			int year2 = Integer.parseInt(date2.substring(0, 4));
			int month2 = Integer.parseInt(date2.substring(4, 6))-1;
			int day2 = Integer.parseInt(date2.substring(6, 8));
			cal.set(year2, month2,day2);
			long d2 = cal.getTimeInMillis();
			
			System.out.println((d2-d1)/1000/60/60/24+1);
		}
		bf.close();
	}

}
