package com.itheima.ssm.service;

import com.itheima.ssm.domain.Role;
import com.itheima.ssm.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUserService extends UserDetailsService {
    public List<UserInfo> findAll() throws Exception;
    public void save(UserInfo user) throws Exception;
    public UserInfo findById(String id) throws  Exception;

    List<Role> findUserByIdAndAllRole(String userid) throws Exception;
}
