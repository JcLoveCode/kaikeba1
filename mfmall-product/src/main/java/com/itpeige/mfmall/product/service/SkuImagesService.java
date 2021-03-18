package com.itpeige.mfmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itpeige.common.utils.PageUtils;
import com.itpeige.mfmall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author peige
 * @email sunlightcs@gmail.com
 * @date 2021-03-03 21:03:08
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

