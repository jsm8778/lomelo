package com.lomelo.scraper.saramin;

import com.lomelo.scraper.Scraper;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class SaraminScraper extends Scraper {
    public final String RECRUIT_URL = "https://www.saramin.co.kr/zf_user/search/recruit?searchType=search&searchword=#{keyword}";

    public List<Map<String, Object>> getRecruitList(String searchType, String keyword){
        String url;
        switch (searchType){
            case "RECRUIT":
                url= RECRUIT_URL;
                break;
            default:
                url = RECRUIT_URL;
                break;
        }
        String target = url.replace("#{keyword}", keyword);
        Document doc = getPageData(target);
        List<Map<String, Object>> resultList = getRecruitList(doc);
        return resultList;
    }

    public List<Map<String, Object>> getRecruitList(Document doc){
        List<Map<String, Object>> resultList = new ArrayList<Map<String, Object>>();
        if(doc.title().contains("0건"))
            return resultList;
        Elements itemList = doc.getElementsByClass("item_recruit");
        for (Element element : itemList) {
            Map<String, Object> item = new HashMap<String, Object>();
            try {
                item.put("title", element.getElementsByClass("data_layer").get(0).attr("title"));
                item.put("href", "https://www.saramin.co.kr"+element.getElementsByClass("data_layer").get(0).attr("href"));
                item.put("date", element.getElementsByClass("date").text());
                item.put("corp", element.getElementsByClass("area_corp").get(0).getElementsByTag("strong").text());
                item.put("jobCondition", element.getElementsByClass("job_condition").get(0).getElementsByTag("span").text());
            }catch (Exception e) {
                e.printStackTrace();
                continue;
            }
            resultList.add(item);
        }

        return resultList;
    }
}
