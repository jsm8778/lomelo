package com.lomelo.document.Account;

import java.util.List;
import java.util.Optional;

public interface AccoutRepositoryCustom{
    List<Account> getAllAccountList();

    Optional<Account> getAccount(String _id);
}
