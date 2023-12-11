package com.ashokit.banking.service;

import com.ashokit.banking.model.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    public List<Account> getAllAccounts();

    public Optional<Account> getAccountById(String id);

    public Account createAccount(Account account);

    public Account updateAccount(Account account);

    public void deleteAccount(String id);
}
