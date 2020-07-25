package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Permission;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IPermissionDao {
    @Select("select * from permission where id in (select permissionid from role_permission where roleid = #{id})")
    List<Permission> findPermissionByRoleId(String id) throws Exception;
}
