package com.cn.hnust.util;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.List;

public class GithubRepoPageProcessor implements PageProcessor {

    /**
     * 部分一：抓取网站的相关配置，包括编码、抓取间隔、重试次数等
     */
    private Site site = Site.me().setRetryTimes(3).setSleepTime(100);

    /**
     *   process是定制爬虫逻辑的核心接口，在这里编写抽取逻辑
     */
    @Override
    public void process(Page page) {
        
        // 部分二：定义如何抽取页面信息，并保存下来
       /* page.putField("author", page.getUrl().regex("https://github\\.com/(\\w+)/.*").toString());*/
    	List<String> sort = page.getHtml().xpath("//table[@class='list-table']/tbody/tr").all();
        List<String> keyword = page.getHtml().xpath("//table[@class='list-table']/tbody/tr/td[@class='keyword']/span/text()").all();

    	for (int i = 1;i<sort.size();i++) {

			System.out.println(sort.get(i).toString());

		}
/*        page.putField("title", page.getHtml().xpath("//div[@class='ui four cards all-projects']/div[@class='ui fluid card']/div[@class='content description-content']/div[@class='header']/a/text()").all().toString());
        page.putField("description", page.getHtml().xpath("//div[@class='ui four cards all-projects']/div[@class='ui fluid card']/div[@class='content description-content']/div[@class='description']/p/text()").all().toString());
        if (page.getResultItems().get("title")==null){tbody
            //skip this page
            page.setSkip(true);
        }*/

        /*page.putField("readme", page.getHtml().xpath("//div[@id='readme']/tidyText()"));*/
        // 部分三：从页面发现后续的url地址来抓取
        /*page.addTargetRequests(page.getHtml().links().regex("(https://github\\.com/\\w+/\\w+)").all());*/
    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        Spider.create(new GithubRepoPageProcessor()).addUrl("http://top.baidu.com/buzz?b=1&fr=topindex").thread(5).run();
    }
}