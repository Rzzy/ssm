package com.itheima.ssm.dao;

import com.itheima.ssm.domain.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IUserDao {
    @Select("select * from users where username = #{userName}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "email", column = "email"),
            @Result(property = "password", column = "password"),
            @Result(property = "phoneNum", column = "phoneNum"),
            @Result(property = "status", column = "status"),
            @Result(property = "roles",column = "id",javaType = java.util.List.class,many = @Many(select = "com.itheima.ssm.dao.IRoleDao.findRoleByUserId"))
    })
    public UserInfo findByUserName(String userName) throws Exception;

    @Select("select * from users")
    public List<UserInfo> findAll() throws Exception;

    @Insert("insert into users(EMAIL,USERNAME,PASSWORD,PHONENUM,STATUS) VALUES(#{email},# {username},#{password},#{phoneNum},#{status})")
    public void save(UserInfo user) throws Exception;
}
