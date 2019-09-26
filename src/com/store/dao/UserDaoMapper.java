package com.store.dao;

import com.store.entry.User;
import org.apache.ibatis.annotations.Param;

public interface UserDaoMapper {

    public User getUserByNameAndPwd(@Param("uName")String uName,@Param("uPwd")String uPwd);
}
