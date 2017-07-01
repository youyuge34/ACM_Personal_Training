package json实例;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
public class main3 {
	 public static final String DEF_CHATSET = "UTF-8";
	    public static final int DEF_CONN_TIMEOUT = 30000;
	    public static final int DEF_READ_TIMEOUT = 30000;
	    public static String userAgent =  "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";
	 
	    //配置您申请的KEY
	    public static final String APPKEY ="74bcf9c6c28c65024a0694685c49b416";
	 
	    //1.微信精选列表
	    public static String getRequest1(){
	        String result =null;
	        String url ="http://v.juhe.cn/weixin/query";//请求接口地址
	        Map params = new HashMap();//请求参数
	            params.put("pno","");//当前页数，默认1
	            params.put("ps","");//每页返回条数，最大100，默认20
	            params.put("key",APPKEY);//应用APPKEY(应用详细页查询)
	            params.put("dtype","");//返回数据的格式,xml或json，默认json
	 
	        try {
	            result =net(url, params, "GET");
	            JSONObject object = JSONObject.fromObject(result);
	            if(object.getInt("error_code")==0){
	                System.out.println(object.get("result"));
	                return (object.get("result").toString());
	            }else{
	                System.out.println(object.get("error_code")+":"+object.get("reason"));
	                return "error";
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
			return "error";
	    }
	 
	 
	 
	    public static void main(String[] args) {
	 String s=getRequest1();
	 System.out.println(s);
//	 if(s!="error"){
//		 JSONObject object = JSONObject.fromObject(s);
//		 JSONArray ll=object.getJSONArray("list");
//		 for (int i = 0; i <ll.size() ; i++){
//			 JSONObject msg = ll.getJSONObject(i);
//			 String title = msg.getString("title");
//			 String url = msg.getString("url");
//			 System.out.println("title: "+title);
//			 System.out.println("url: "+url);
//		 }
		 
//	 }
	    }
	 
	    /**
	     *
	     * @param strUrl 请求地址
	     * @param params 请求参数
	     * @param method 请求方法
	     * @return  网络请求字符串
	     * @throws Exception
	     */
	    public static String net(String strUrl, Map params,String method) throws Exception {
	        HttpURLConnection conn = null;
	        BufferedReader reader = null;
	        String rs = null;
	        try {
	            StringBuffer sb = new StringBuffer();
	            if(method==null || method.equals("GET")){
	                strUrl = strUrl+"?"+urlencode(params);
	            }
	            URL url = new URL(strUrl);
	            conn = (HttpURLConnection) url.openConnection();
	            if(method==null || method.equals("GET")){
	                conn.setRequestMethod("GET");
	            }else{
	                conn.setRequestMethod("POST");
	                conn.setDoOutput(true);
	            }
	            conn.setRequestProperty("User-agent", userAgent);
	            conn.setUseCaches(false);
	            conn.setConnectTimeout(DEF_CONN_TIMEOUT);
	            conn.setReadTimeout(DEF_READ_TIMEOUT);
	            conn.setInstanceFollowRedirects(false);
	            conn.connect();
	            if (params!= null && method.equals("POST")) {
	                try {
	                    DataOutputStream out = new DataOutputStream(conn.getOutputStream());
	                        out.writeBytes(urlencode(params));
	                } catch (Exception e) {
	                    // TODO: handle exception
	                }
	            }
	            InputStream is = conn.getInputStream();
	            reader = new BufferedReader(new InputStreamReader(is, DEF_CHATSET));
	            String strRead = null;
	            while ((strRead = reader.readLine()) != null) {
	                sb.append(strRead);
	            }
	            rs = sb.toString();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (reader != null) {
	                reader.close();
	            }
	            if (conn != null) {
	                conn.disconnect();
	            }
	        }
	        return rs;
	    }
	 
	    //将map型转为请求参数型
	    public static String urlencode(Map<String,Object>data) {
	        StringBuilder sb = new StringBuilder();
	        for (Map.Entry i : data.entrySet()) {
	            try {
	                sb.append(i.getKey()).append("=").append(URLEncoder.encode(i.getValue()+"","UTF-8")).append("&");
	            } catch (UnsupportedEncodingException e) {
	                e.printStackTrace();
	            }
	        }
	        return sb.toString();
	    }
}
