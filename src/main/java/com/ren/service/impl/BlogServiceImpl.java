package com.ren.service.impl;

import com.ren.entity.Blog;
import com.ren.mapper.BlogMapper;
import com.ren.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ren
 * @since 2021-01-16
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
