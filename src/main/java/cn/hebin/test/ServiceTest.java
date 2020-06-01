package cn.hebin.test;

import cn.hebin.domain.Account;
import cn.hebin.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest{

    /**
     * 查询
     */
    @Test
    public void run1() {
        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // 获取对象
        AccountService as = (AccountService) ac.getBean("accountService");
        // 调用方法
        as.findAll();
    }

    /**
     * 保存
     */
    @Test
    public void run2() {
        Account account = new Account();
        account.setName("熊四");
        account.setMoney(400d);

        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // 获取对象
        AccountService as = (AccountService) ac.getBean("accountService");
        // 调用方法
        as.saveAccount(account);
    }

    /**
     * 删除
     */
    @Test
    public void run3() {
        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // 获取对象
        AccountService as = (AccountService) ac.getBean("accountService");
        // 调用方法
        as.deleteAccount(4);
    }

    /**
     * 修改
     */
    @Test
    public void run4() {
        Account account = new Account();
        account.setId(3);
        account.setName("熊五");
        account.setMoney(500d);

        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // 获取对象
        AccountService as = (AccountService) ac.getBean("accountService");
        // 调用方法
        as.updateAccount(account);
    }


}
