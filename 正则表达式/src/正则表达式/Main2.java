package 正则表达式;
import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStream;
 import java.io.InputStreamReader;
 import java.net.HttpURLConnection;
 import java.net.URL;
 import java.util.regex.Matcher;
 import java.util.regex.Pattern;
public class Main2 {
	private static String httpGet(String html){
		StringBuffer buffer=null;
		BufferedReader bufferedreader=null;
		InputStream inputstream=null;
		InputStreamReader inputstreamreader=null;
		HttpURLConnection httpconn=null;
		
		try{
			URL url=new URL(html);
			httpconn=(HttpURLConnection)url.openConnection();
			httpconn.setDoInput(true);
			httpconn.setRequestMethod("GET");
			
			inputstream = httpconn.getInputStream();
			inputstreamreader=new InputStreamReader(inputstream,"utf-8");
			bufferedreader=new BufferedReader(inputstreamreader);
			
			buffer =new StringBuffer();
			String str=null;
			while((str=bufferedreader.readLine())!=null){
				buffer.append(str);
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return buffer.toString();
	}
	
	private static String filter(String html){
		StringBuffer buffer=new StringBuffer();
		
		Pattern p=Pattern.compile("<input type=\"hidden\" id=\"hidden_title\" value=\"(.*?)(\" \\/>)");
//<input type="hidden" id="hidden_title" value="11月04日08时 周五  晴转多云  21/10°C">
		Matcher m = p.matcher(html);  
		if(m.find()){
			buffer.append(m.group(1));
		}else buffer.append("not found");
		
		return buffer.toString();
	}
	public static void main(String[] args) {

		String html=httpGet("http://www.weather.com.cn/weather1d/101190101.shtml");
		System.out.println(filter(html));
	}

}
