package com.lomelo.document.Account;

import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoOperations;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
class AccountRepositoryImpl implements AccoutRepositoryCustom{

    private final MongoOperations operations;

    @Override
    public List<Account> getAllAccountList() {
        var result = operations.findAll(Account.class);
        return result.stream().toList();
    }

    @Override
    public Optional<Account> getAccount(String _id) {
        return Optional.empty();
    }
}
