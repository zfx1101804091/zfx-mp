package com.zfx.gmall.ums.service.impl;

import com.zfx.gmall.ums.entity.Member;
import com.zfx.gmall.ums.mapper.MemberMapper;
import com.zfx.gmall.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author zheng_fx
 * @since 2020-01-31
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
