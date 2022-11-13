package com.lomelo.httpApi.controller;

import com.lomelo.common.Result;
import com.lomelo.httpApi.service.ApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
public class ApiController {
    @Autowired
    private ApiService apiService;

    @GetMapping("/api/scraper/{type}/{keyword}")
    public Result scraper(@PathVariable("type") String type, @PathVariable("keyword") String keyword) {
        try {
            if(type.isEmpty() || keyword.isEmpty())
                throw new NullPointerException("type and keyword must not be null or empty");
            List<Map<String, Object>> scrapList = apiService.getScrapList(type, keyword);
            return Result.Create(true, scrapList.size()+"건 조회 완료",scrapList);
        }catch (Exception e){
            e.printStackTrace();
            return Result.Create(false, e.getMessage());
        }
    }

}
