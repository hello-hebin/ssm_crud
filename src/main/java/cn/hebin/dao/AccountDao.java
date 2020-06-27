package cn.hebin.dao;

import cn.hebin.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {

    /**
     * 查询所有信息
     * @return
     */
    @Select("select * from account")
    public List<Account> findAll();

    /**
     * 保存
     * @param account
     */
    @Insert("insert into account (name,money) values (#{name},#{money})")
    public void saveAccount(Account account);

    /**
     * 根据id删除
     * @param id
     */
    @Delete("delete from account where id = #{id} ")
    public void deleteAccount(Integer id);

    /**
     * 根据id修改
     * @param account
     */
    @Update("update account set name = #{name},money=#{money} where id = #{id}")
    public void updateAccount(Account account);

}
