package com.zfx.demo.service.impl;

import com.zfx.demo.entity.User;
import com.zfx.demo.mapper.UserMapper;
import com.zfx.demo.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
