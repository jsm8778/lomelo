package com.lomelo.scraper;


import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class Scraper {
    public Document getPageData(String URL){
        Connection conn = Jsoup.connect(URL).maxBodySize(0);

        // 3. HTML 파싱.
        Document html = null; // conn.post();
        try {
            html = conn.get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return html;
    }
}
