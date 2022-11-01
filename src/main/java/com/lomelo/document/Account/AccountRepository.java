package com.lomelo.document.Account;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface AccountRepository extends CrudRepository<Account, String> , AccoutRepositoryCustom{
    @Query("{}")
    List<Account> findAllByCustomQueryWithList();

    @Override
    Optional<Account> findById(String _id);

    Account save(Account account);


}
