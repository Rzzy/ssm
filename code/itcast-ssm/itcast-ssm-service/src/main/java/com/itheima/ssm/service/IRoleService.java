package com.itheima.ssm.service;

import com.itheima.ssm.domain.Permission;
import com.itheima.ssm.domain.Role;

import java.util.List;

public interface IRoleService {
    public List<Role> findAll() throws Exception;
    public void save(Role role) throws Exception;

    public void deleteRole(String roleId) throws Exception;

    public Role findById(String roleId) throws Exception;

    public List<Permission> findRoleByIdAndAllPermission(String roleId);

    void addPermissionToRole(String roleId, String[] permissionIds) throws Exception;
}
