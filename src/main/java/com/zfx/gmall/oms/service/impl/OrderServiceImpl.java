package com.zfx.gmall.oms.service.impl;

import com.zfx.gmall.oms.entity.Order;
import com.zfx.gmall.oms.mapper.OrderMapper;
import com.zfx.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author zheng_fx
 * @since 2020-01-31
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
