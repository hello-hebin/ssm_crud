package cn.hebin.service.impl;

import cn.hebin.dao.AccountDao;
import cn.hebin.domain.Account;
import cn.hebin.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户");
        return accountDao.findAll();
    }

    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户信息");
        accountDao.saveAccount(account);
    }

    public void deleteAccount(Integer id) {
        System.out.println("业务层：根据id删除账户信息");
        accountDao.deleteAccount(id);
    }

    public void updateAccount(Account account) {
        System.out.println("业务层：根据id修改账户信息");
        accountDao.updateAccount(account);
    }

}
