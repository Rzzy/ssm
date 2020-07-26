package com.itheima.ssm.controller;

import com.itheima.ssm.domain.Order;
import com.itheima.ssm.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    /**
     * 查询所有订单
     * @param page
     * @param size
     * @return
     * @throws Exception
     */
    @RequestMapping("/findAll.do")
    @Secured("ROLE_ADMIN")
    public ModelAndView findAll(@RequestParam(name = "page",required = true,defaultValue = "1") int page, @RequestParam(name = "size",required = true,defaultValue = "2") int size) throws Exception{

        ModelAndView mv = new ModelAndView();

        List<Order> orders = orderService.findAll(page,size);
        mv.setViewName("orders-list");
        mv.addObject("ordersList",orders);
        return mv;
    }
    @RequestMapping("/findById.do")
    public ModelAndView findById(@RequestParam(name = "id",required = true) String id) throws Exception {
        ModelAndView mv = new ModelAndView();

        Order orderDeetail = orderService.findById(id);
        mv.addObject("orders", orderDeetail);
        mv.setViewName("orders-show");
        return mv;
    }
}
