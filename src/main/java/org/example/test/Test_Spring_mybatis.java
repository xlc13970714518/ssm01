package org.example.test;

import org.example.domain.Account;
import org.example.service.AccountService1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class Test_Spring_mybatis {
     @Autowired
    public AccountService1 accountService1;
     @Test
     public  void testSaveAccount(){
         Account account=new Account();
         account.setName("xlc");
         account.setMoney(5500.00);
         accountService1.saveAccount(account);

     }
     @Test
     public void findAllAccount(){
         List <Account> list1=accountService1.findAll();
         System.out.println(list1);
     }
}
