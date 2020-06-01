package cn.hebin.test;


import cn.hebin.dao.AccountDao;
import cn.hebin.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    /**
     * 测试查询
     * @throws Exception
     */
    @Test
    public void run1() throws Exception {
        // 加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig-delete.xml");
        // 创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建sqlSession对象
        SqlSession session = factory.openSession();
        // 获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        // 调用查询的方法
        List<Account> list = dao.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
        //释放资源
        session.close();
        in.close();
    }

    /**
     * 测试保存
     * @throws Exception
     */
    @Test
    public void run2() throws Exception {
        Account account = new Account();
        account.setName("熊二");
        account.setMoney(200d);

        // 加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig-delete.xml");
        // 创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建sqlSession对象
        SqlSession session = factory.openSession();
        // 获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        dao.saveAccount(account);

        //提交事务
        session.commit();
        //释放资源
        session.close();
        in.close();
    }

    /**
     * 测试删除
     * @throws Exception
     */
    @Test
    public void run3() throws Exception {
        // 加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig-delete.xml");
        // 创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建sqlSession对象
        SqlSession session = factory.openSession();
        // 获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        dao.deleteAccount(4);

        //提交事务
        session.commit();
        //释放资源
        session.close();
        in.close();
    }

    /**
     * 测试根据id修改
     * @throws Exception
     */
    @Test
    public void run4() throws Exception {
        Account account = new Account();
        account.setId(5);
        account.setName("熊二");
        account.setMoney(300d);

        // 加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig-delete.xml");
        // 创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建sqlSession对象
        SqlSession session = factory.openSession();
        // 获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        dao.updateAccount(account);

        //提交事务
        session.commit();
        //释放资源
        session.close();
        in.close();
    }

}
