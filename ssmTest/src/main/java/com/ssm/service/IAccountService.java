package com.ssm.service;

import com.ssm.ddmain.Account;

import java.util.List;

public interface IAccountService {

    List<Account> findAll();

    void saveAccount(Account account);
}
