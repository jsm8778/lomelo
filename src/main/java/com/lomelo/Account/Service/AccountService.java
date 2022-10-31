package com.lomelo.Account.Service;

import com.lomelo.document.Account;
import com.lomelo.document.AccoutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccoutRepository accoutRepository;

    public Optional<Account> getAccount(String _id){
        return accoutRepository.findById(_id);
    }

    public List<Account> getAllAccount(){
        return accoutRepository.findAll();
    }

//
//    public Account insertAccount(Account body){
//        return accoutRepository.insertAccount(body);
//    }
}
