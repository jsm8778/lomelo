package com.lomelo.httpApi.service;

import com.lomelo.common.Result;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface ApiService {

    public List<Map<String,Object>> getScrapList(String searchType, String keyword);
}
