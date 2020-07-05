package com.itheima.ssm.service;

import com.itheima.ssm.domain.Order;

import java.util.List;

public interface IOrderService {
    public List<Order> findAll(int page, int size) throws Exception;
    public Order findById(String id) throws Exception;
}
