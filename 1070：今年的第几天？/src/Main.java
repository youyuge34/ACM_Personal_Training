import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int year1 = in.nextInt();
			int month1 = in.nextInt();
			int day1 = in.nextInt();
			Calendar cal = Calendar.getInstance();
			cal.set(year1, month1-1,day1);
			long d1 = cal.getTimeInMillis();
			cal.set(year1, 0,1);
			long d2 = cal.getTimeInMillis();
			System.out.println((d1-d2)/1000/60/60/24+1);
		}
		in.close();
	}

}
