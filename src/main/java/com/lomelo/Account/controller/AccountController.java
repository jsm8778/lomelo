package com.lomelo.Account.controller;

import com.lomelo.Account.Service.AccountService;
import com.lomelo.document.Account.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class AccountController {
    @Autowired
    AccountService accountService;

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

}
