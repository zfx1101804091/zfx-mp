package com.zfx.gmall.pms.service.impl;

import com.zfx.gmall.pms.entity.Product;
import com.zfx.gmall.pms.mapper.ProductMapper;
import com.zfx.gmall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author zheng_fx
 * @since 2020-01-31
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
