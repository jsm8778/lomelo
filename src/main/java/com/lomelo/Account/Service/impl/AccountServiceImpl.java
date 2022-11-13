package com.lomelo.Account.Service.impl;

import com.lomelo.Account.Service.AccountService;
import com.lomelo.document.Account.Account;
import com.lomelo.document.Account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository repository;

    @Override
    public Optional<Account> getAccount(String _id) {
        return repository.findById(_id);
    }

    @Override
    public List<Account> getAllAccount() {
        return repository.findAllByCustomQueryWithList();
    }

    @Override
    public Account insertAccount(Account body) {
        return repository.save(body);
    }

}
