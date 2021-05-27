package org.example.service;

import org.example.domain.Account;

import java.util.List;

public interface AccountService1 {
    public List<Account> findAll();//查询所有
    public void saveAccount(Account account);//添加账户
}
