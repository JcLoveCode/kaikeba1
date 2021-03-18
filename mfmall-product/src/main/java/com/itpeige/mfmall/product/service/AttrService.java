package com.itpeige.mfmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itpeige.common.utils.PageUtils;
import com.itpeige.mfmall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author peige
 * @email sunlightcs@gmail.com
 * @date 2021-03-03 21:03:08
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

