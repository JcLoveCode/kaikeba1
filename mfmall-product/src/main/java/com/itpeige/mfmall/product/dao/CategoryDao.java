package com.itpeige.mfmall.product.dao;

import com.itpeige.mfmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author peige
 * @email sunlightcs@gmail.com
 * @date 2021-03-03 21:03:08
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
