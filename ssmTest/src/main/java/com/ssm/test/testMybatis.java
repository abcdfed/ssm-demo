package com.ssm.test;

import com.ssm.dao.IAccountDao;
import com.ssm.ddmain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.InputStream;
import java.util.List;

public class testMybatis {

    @Test
    public void testMybatis() throws  Exception{
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = factory.openSession(true);
        IAccountDao accountDao = sqlSession.getMapper(IAccountDao.class);
//        List<Account> accountList = accountDao.findAll();
//        for(Account account : accountList){
//            System.out.println(account);
//        }

        Account account = new Account();

        account.setName("enen");
        account.setMoney(20000d);
        accountDao.saveAccount(account);

        sqlSession.close();
        inputStream.close();
    }
}
