package com.cn.by.test;

import com.cn.by.util.StringUtils;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.List;

/**
* @author By
* @date 2018/3/1 14:22
* @description 爬虫测试代码
* @return
*/
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

        List<String> movieTitle = page.getHtml().xpath("//*[@id=\"content\"]/h1").all();

        for (int i = 0; i < movieTitle.size(); i++) {
            System.out.println(StringUtils.removeHtml(movieTitle.get(i)));
        }

        // 部分三：从页面发现后续的url地址来抓取
        page.addTargetRequests(page.getHtml().links().regex("(https://movie.douban.com/subject/[\\w\\-]+/)").all());
    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        Spider.create(new GithubRepoPageProcessor())
                //从"https://github.com/code4craft"开始抓
                .addUrl("https://movie.douban.com/chart")
                //开启5个线程抓取
                .thread(5)
                //启动爬虫
                .run();
    }
}
