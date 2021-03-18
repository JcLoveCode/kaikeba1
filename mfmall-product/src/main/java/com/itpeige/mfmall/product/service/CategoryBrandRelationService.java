package com.itpeige.mfmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itpeige.common.utils.PageUtils;
import com.itpeige.mfmall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author peige
 * @email sunlightcs@gmail.com
 * @date 2021-03-03 21:03:08
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

