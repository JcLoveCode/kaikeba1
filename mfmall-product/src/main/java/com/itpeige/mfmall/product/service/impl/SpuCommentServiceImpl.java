package com.itpeige.mfmall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itpeige.common.utils.PageUtils;
import com.itpeige.common.utils.Query;

import com.itpeige.mfmall.product.dao.SpuCommentDao;
import com.itpeige.mfmall.product.entity.SpuCommentEntity;
import com.itpeige.mfmall.product.service.SpuCommentService;


@Service("spuCommentService")
public class SpuCommentServiceImpl extends ServiceImpl<SpuCommentDao, SpuCommentEntity> implements SpuCommentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuCommentEntity> page = this.page(
                new Query<SpuCommentEntity>().getPage(params),
                new QueryWrapper<SpuCommentEntity>()
        );

        return new PageUtils(page);
    }

}