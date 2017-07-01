package webMagic;
import org.apache.log4j.*;
public class log4j {
	Logger log=Logger.getLogger(log4j.class);
	
	public log4j(){
		log.warn("warnnnnnn!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropertyConfigurator.configure("log4j.properties");
		log4j m=new log4j();
	}

}
