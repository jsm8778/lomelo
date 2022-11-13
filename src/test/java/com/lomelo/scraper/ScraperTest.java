package com.lomelo.scraper;

import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class ScraperTest {

    @Test
    void getPageData() {
        Scraper scraper = new Scraper();
        Document document = scraper.getPageData("https://www.saramin.co.kr/zf_user/search/recruit?searchType=search&searchword=사람인");
        System.out.println(document.toString());
        assertEquals("body", document.getElementsByTag("body").get(0).tag().getName());
    }

}