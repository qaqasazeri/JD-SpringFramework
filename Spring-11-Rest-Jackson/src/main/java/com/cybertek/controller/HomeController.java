package com.cybertek.controller;

import com.cybertek.entity.Account;
import com.cybertek.entity.User;
import com.cybertek.repository.AccountRepository;
import com.cybertek.repository.UserRepository;
import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

   private UserRepository userRepository;
    private AccountRepository accountRepository;

    public HomeController(UserRepository userRepository, AccountRepository accountRepository) {
        this.userRepository = userRepository;
        this.accountRepository = accountRepository;
    }

    @GetMapping("/users")
    private List<User> readAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/accounts")
    private List<Account> readAllAccounts(){
        return accountRepository.findAll();
    }
}
