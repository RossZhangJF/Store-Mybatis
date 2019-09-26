package com.store.test;

import com.store.dao.UserDaoMapper;
import com.store.dao.WebShopDaoMapper;
import com.store.entry.User;
import com.store.entry.WebShop;
import com.store.utils.MyTools;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TestStoreWeb {
    public static void main(String[] args) {
        SqlSession session = MyTools.getSqlSession();
        /*
        UserDaoMapper userMapper=session.getMapper(UserDaoMapper.class);
        User user=userMapper.getUserByNameAndPwd("admin","123");
        System.out.println(user);
        */
        WebShopDaoMapper webMapper = session.getMapper(WebShopDaoMapper.class);
        List<WebShop> list= webMapper.getWebShop();
        System.out.println(list);
    }
}
