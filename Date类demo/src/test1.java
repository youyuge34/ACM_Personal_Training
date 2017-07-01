import java.util.Date;

public class test1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Date date=new Date();
    System.out.println(date);
    long time=date.getTime();
    System.out.println(time/365.0/24/3600/1000);
    System.out.println(date.getMonth());
    Date date2=new Date(2016, 2, 19);
    System.out.println(date2.getMonth());
	}

}
