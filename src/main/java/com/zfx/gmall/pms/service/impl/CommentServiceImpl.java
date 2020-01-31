package com.zfx.gmall.pms.service.impl;

import com.zfx.gmall.pms.entity.Comment;
import com.zfx.gmall.pms.mapper.CommentMapper;
import com.zfx.gmall.pms.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author zheng_fx
 * @since 2020-01-31
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
