package cn.hebin.service;

import cn.hebin.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AccountService  {

    /**
     * 查询所有信息
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存
     * @param account
     */
    public void saveAccount(Account account);

    /**
     * 根据id删除
     * @param id
     */
    public void deleteAccount(Integer id);

    /**
     * 根据id修改
     * @param account
     */
    public void updateAccount(Account account);

}
