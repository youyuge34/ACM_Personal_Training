package webMagic;

import org.apache.log4j.PropertyConfigurator;

import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.monitor.SpiderMonitor;
import us.codecraft.webmagic.pipeline.FilePipeline;
import us.codecraft.webmagic.processor.example.GithubRepoPageProcessor;
import us.codecraft.webmagic.processor.example.OschinaBlogPageProcessor;

public class monitor {

    public static void main(String[] args) throws Exception {
    	PropertyConfigurator.configure("log4j.properties");
        Spider zhiSpider = Spider.create(new zhihu())
                .addUrl("http://my.oschina.net/flashsword/blog")
                .addUrl("http://www.zhihu.com/search?type=question&q=白色相簿")
                .addPipeline(new FilePipeline("/Users/yousheng/white_album2")).
                thread(5);
       
        SpiderMonitor.instance().register(zhiSpider);
        zhiSpider.start();
    }
}