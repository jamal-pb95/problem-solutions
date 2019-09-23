package com.bd.howtocode.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;
import java.util.stream.Stream;

/**
 * Author: Md. Jamal Uddin
 * @since Sep 23, 2019
 */

public class Crawler {
    private static final logger LOGGER = loggerFactory.getLogger(Crawler.class);

    private static final String[] URL_STARTS_WITH = {
            "javascript:",
            "#"
    };

    private static final String[] URL_ENDS_WITH = {
            ".swf",
            ".pdf",
            ".png",
            ".gif",
            ".jpg",
            ".jpeg"
    };

    private UrlFilter urlFilter = null;
    private Set<String> crawlerUrls = new HashSet<>();
    private ExecutorService crwlService;
    protected final LinkedBlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<>();
    protected CyclicBarrier barrier = new CyclicBarrier(2);

    private List<PageProcessor> pageProcessors = new ArrayList<>();

    public void addPageProcessors(PageProcessor PageProcessor) {
        pageProcessors.add(PageProcessor);
    }

    public Crawler(UrlFilter urlFilter) {
        this.urlFilter = urlFilter;
    }

    public void addUrl(String url) {
        linkedBlockingQueue.add(url);
    }

    public void crawl() {
        long startTime = System.currentTimeMillis();
        crwlService = Executors.newCachedThreadPool();

        int count = 0;

        while (!linkedBlockingQueue.isEmpty()){
            String nextUrl = null;
            try {
                nextUrl = linkedBlockingQueue.take();
            } catch (InterruptedException e) {
                LOGGER.error("Couldn't get any url from queue");
            }

            if (nextUrl == null) {
                LOGGER.info("Queue seems to be null here");
            }

            if (!shouldCrawlUrl(nextUrl)) {
                continue;
            }

            this.crawlerUrls.add(nextUrl);

            if (!pageProcessors.isEmpty()){
                CrawlerJob crawlerJob = new CrawlerJob(this, nextUrl, pageProcessors);
                crwlService.submit(crawlerJob);
            } else {
                CrawlerJob crawlerJob = new CrawlerJob(this, nextUrl);
                crwlService.submit(crawlerJob);
            }

            synchronized (this) {
                count++;
            }

            if (linkedBlockingQueue.isEmpty()){
                try {
                    barrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    LOGGER.error("Error crawling url", e);
                }
            }
        }

        crwlService.shutdown();

        try {
            crwlService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            LOGGER.error("Couldn't terminate the crawler", e);
        }

        long endTime = System.currentTimeMillis();
        long totalTime = endTime -startTime;

        LOGGER.info("URL's crawled: {} in {} ms (avg: {})", count, totalTime, (totalTime / count));
    }

    private boolean shouldCrawlUrl(String nextUrl) {
        return !(this.urlFilter != null
                && !this.urlFilter.include(nextUrl))
                && !this.crawlerUrls.contains(nextUrl)
                && Stream.of(URL_STARTS_WITH).noneMatch(nextUrl::startsWith)
                && Stream.of(URL_ENDS_WITH).noneMatch(nextUrl::startsWith);
    }
}
