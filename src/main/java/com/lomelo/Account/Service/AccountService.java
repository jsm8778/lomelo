package com.lomelo.Account.Service;

import com.lomelo.document.Account.Account;
import com.lomelo.document.Account.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountService {

    @Autowired
    AccountRepository repository;

    public Optional<Account> getAccount(String _id){
//        return null;
        return repository.findById(_id);
    }
//
    public List<Account> getAllAccount(){

        return repository.findAllByCustomQueryWithList();
    }

    public Account insertAccount(Account body){
        return repository.save(body);
    }
}
