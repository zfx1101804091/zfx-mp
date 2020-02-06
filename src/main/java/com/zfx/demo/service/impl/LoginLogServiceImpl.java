package com.zfx.demo.service.impl;

import com.zfx.demo.entity.LoginLog;
import com.zfx.demo.mapper.LoginLogMapper;
import com.zfx.demo.service.LoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zheng_fx
 * @since 2020-02-06
 */
@Service
public class LoginLogServiceImpl extends ServiceImpl<LoginLogMapper, LoginLog> implements LoginLogService {

}
