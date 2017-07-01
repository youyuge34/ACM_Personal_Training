import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int year = in.nextInt();
			int days = in.nextInt();
			Calendar cal = Calendar.getInstance();
			cal.set(year, 0,1);
			long d1 = cal.getTimeInMillis();
			long inter = (days-1)*24L*3600L*1000L;
			d1+=inter;
			cal.setTimeInMillis(d1);
//			System.out.println(cal.get(Calendar.YEAR)+"-"+(cal.get(Calendar.MONTH)+1)+"-"+cal.get(Calendar.DAY_OF_MONTH));
			System.out.printf("%04d-%02d-%02d\n",cal.get(Calendar.YEAR),(cal.get(Calendar.MONTH)+1),cal.get(Calendar.DAY_OF_MONTH));
		}
	}

}
