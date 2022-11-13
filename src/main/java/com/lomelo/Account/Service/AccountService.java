package com.lomelo.Account.Service;

import com.lomelo.document.Account.Account;
import com.lomelo.document.Account.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface AccountService {

    public Optional<Account> getAccount(String _id);

    public List<Account> getAllAccount();

    public Account insertAccount(Account body);
}
