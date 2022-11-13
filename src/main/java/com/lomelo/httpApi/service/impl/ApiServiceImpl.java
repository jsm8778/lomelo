package com.lomelo.httpApi.service.impl;

import com.lomelo.scraper.saramin.SaraminScraper;
import com.lomelo.httpApi.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ApiServiceImpl implements ApiService {

    @Autowired
    SaraminScraper scraper;

    @Override
    public List<Map<String, Object>> getScrapList(String searchType, String keyword) {
        return scraper.getRecruitList(searchType, keyword);
    }
}
