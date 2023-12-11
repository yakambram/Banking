package com.ashokit.banking.repositroy;

import com.ashokit.banking.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, String> { }
