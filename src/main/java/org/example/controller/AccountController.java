package org.example.controller;

import org.example.domain.Account;
import org.example.service.AccountService1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;

@Controller
public class AccountController {
    @Resource
    public AccountService1 accountService1;
    @ResponseBody
    @RequestMapping("/abc")
    public  void testSaveAccount(){
        Account account=new Account();
        account.setName("ll");
        account.setMoney(5500.00);
        accountService1.saveAccount(account);

    }
}
