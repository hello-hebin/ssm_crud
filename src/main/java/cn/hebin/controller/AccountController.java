package cn.hebin.controller;

import cn.hebin.domain.Account;
import cn.hebin.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 账户web
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 查询所有数据
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询所有账户");
        // 调用service的方法
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        for (Account account : list) {
            System.out.println(account);
        }
        return "list";
    }

    /**
     * 保存
     * @return
     */
    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层：保存账户信息");
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");//重定向
        return;
    }

    /**
     * 删除
     * @return
     */
    @RequestMapping("/delete")
    public void delete(Integer id, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层：根据id删除账户信息");
        accountService.deleteAccount(id);
        response.sendRedirect(request.getContextPath()+"/account/findAll");//重定向
        return;
    }

    /**
     * 修改
     * @return
     */
    @RequestMapping("/update")
    public void update(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层：根据id修改账户信息");
        accountService.updateAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");//重定向
        return;
    }
}
