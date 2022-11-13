package com.lomelo.Account.controller;

import com.lomelo.Account.Service.AccountService;
import com.lomelo.common.Result;
import com.lomelo.scraper.Scraper;
import com.lomelo.document.Account.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.jsoup.nodes.Document;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;
    @Autowired
    Scraper scraper;

    @GetMapping("account")
    public List<Account> getAllAccount() {
        List<Account> result = accountService.getAllAccount();
        return result;
    }

    @PostMapping("account")
    public Account getAddAccount(Account account) {
        Account result = accountService.insertAccount(account);
        return result;
    }
    @GetMapping("crawler")
    public Result gethttp(String url) {
         Document result = scraper.getPageData(url);

        return Result.Create(true, result);
    }



}
