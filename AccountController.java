package com.itheima.controller;

import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 包名:com.itheima.controller
 * 作者:Leevi
 * 日期2020-02-21  10:06
 */
@Controller
@RequestMapping("account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("transfer")
    public String transfer(@RequestParam Map paramMap){
        //调用业务层的方法，进行转账
        accountService.transfer(paramMap);
        return "success";
    }
}
