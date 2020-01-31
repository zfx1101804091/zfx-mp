package com.zfx.gmall.oms.service.impl;

import com.zfx.gmall.oms.entity.OrderItem;
import com.zfx.gmall.oms.mapper.OrderItemMapper;
import com.zfx.gmall.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author zheng_fx
 * @since 2020-01-31
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
