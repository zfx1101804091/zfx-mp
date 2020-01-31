package com.zfx.gmall.ums.service.impl;

import com.zfx.gmall.ums.entity.Admin;
import com.zfx.gmall.ums.mapper.AdminMapper;
import com.zfx.gmall.ums.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author zheng_fx
 * @since 2020-01-31
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
