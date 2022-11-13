package com.lomelo.scraper.saramin;

import org.junit.jupiter.api.Test;

class SaraminScraperTest {

    @Test
    void getRecruitList() {
        String searchType = "RECRUIT";
        String keyword  = "모바일엔트로피";
        SaraminScraper saraminCrawler = new SaraminScraper();
        saraminCrawler.getRecruitList(searchType, keyword);
    }

}