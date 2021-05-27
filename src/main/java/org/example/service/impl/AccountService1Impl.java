package org.example.service.impl;


import org.example.dao.AccountDao1;
import org.example.domain.Account;
import org.example.service.AccountService1;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("accountService1")
public class AccountService1Impl implements AccountService1 {
   @Resource
   public AccountDao1 accountDao1;
    @Override
    public List<Account> findAll() {
        System.out.println("执行了查询语句");
        return accountDao1.findAll();

    }

    @Override
    public void saveAccount(Account account) {
        accountDao1.saveAccount(account);
        System.out.println("保存数据成功。");
    }
}
