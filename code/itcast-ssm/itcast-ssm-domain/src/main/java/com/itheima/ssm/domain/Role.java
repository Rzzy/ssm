package com.itheima.ssm.domain;

import java.util.List;

public class Role {
    private String id;
    private String roleName;
    private String roleDesc;
    private List<Permission> permissions;
    private List<User> users;
}
