package webMagic;

import org.apache.log4j.PropertyConfigurator;

//package us.codecraft.webmagic.samples;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.FilePipeline;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * @author code4crafter@gmail.com <br>
 */
public class jingxuanwhite implements PageProcessor {

    public static final String URL_LIST = "https://www\\.zhihu\\.com/topic/19817124/top-answers\\?page=\\d+";

//    public static final String URL_POST = "http://blog\\.sina\\.com\\.cn/s/blog_\\w+\\.html";

    private Site site = Site
            .me()
//            .setDomain("blog.sina.com.cn")
            .setSleepTime(3000)
            .setUserAgent(
                    "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_2) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/26.0.1410.65 Safari/537.31");

    @Override
    public void process(Page page) {
    	if (page.getUrl().regex(URL_LIST).match()){
    		System.out.println("find");
            page.addTargetRequests(page.getHtml().links().regex(URL_LIST).all());
            page.addTargetRequests(page.getHtml().xpath("//div[@class='feed-item feed-item-hook folding']/link/@href").all());
    		
    	}
    	else{//文章页
            page.putField("question", page.getHtml().xpath("//div[@id='zh-question-title']/h2/a/text()"));
            page.putField("details of question", page.getHtml().xpath("//div[@id='zh-question-detail']/div"));
            page.putField("vote",page.getHtml().xpath("//div[@id='zh-question-answer-wrap']/div/div[1]/button[1]/span[1]/text()"));
            page.putField("author",page.getHtml().xpath("//div[@id='zh-question-answer-wrap']/div/div[2]/div[1]/span/span[1]/a/text()"));
            page.putField("time",page.getHtml().xpath("//div[@id='zh-question-answer-wrap']/div/div[4]/div[1]/a[1]/text()"));
            page.putField("answer",page.getHtml().xpath("//*[@id='zh-question-answer-wrap']/div/div[3]/div[2]"));
            
    }}

    @Override	
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
    	PropertyConfigurator.configure("log4j.properties");
        Spider.create(new jingxuanwhite()).addUrl("https://www.zhihu.com/topic/19817124/top-answers?page=1")
                .thread(5).addPipeline(new FilePipeline("/Users/yousheng/white_album2")).run();
    }
}
