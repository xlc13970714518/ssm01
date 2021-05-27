package org.example.dao;

import org.example.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountDao1 {
    List<Account> findAll();//查询所有
    void saveAccount(Account account);//保存账户
}
