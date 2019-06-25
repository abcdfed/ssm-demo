package com.ssm.controller;

import com.ssm.ddmain.Account;
import com.ssm.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping("findAll")
    public String findAll(Model model){
        List<Account> accounts = accountService.findAll();

        for(Account account : accounts){
            System.out.println(account);
        }

        model.addAttribute("list", accounts);

        return "success";
    }


    @RequestMapping("saveAccount")
    public void saveAccount(Account account, HttpServletResponse response, HttpServletRequest request) throws Exception{
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
    }

}
