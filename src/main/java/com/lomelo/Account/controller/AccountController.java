package com.lomelo.Account.controller;

import com.lomelo.Account.Service.AccountService;
import com.lomelo.document.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@Component
public class AccountController {
    @Autowired
    AccountService accountService;

    @PostMapping("account")
    public Account insertAccount(Account account) {
//        Account inserResult = accountService.insertAccount(account);
        return null;
    }

    @GetMapping("account/{id}")
    public Optional<Account> getAccount(@PathVariable String id) {
        Optional<Account> result = accountService.getAccount(id);
        return result;
    }

    @GetMapping("account")
    public List<Account> getAllAccount() {
        List<Account> result = accountService.getAllAccount();
        return result;
    }

}
