package com.lomelo.document;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface AccoutRepository extends MongoRepository<Account, String> {
}
