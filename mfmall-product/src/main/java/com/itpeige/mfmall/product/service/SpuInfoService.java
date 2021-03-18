package com.itpeige.mfmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itpeige.common.utils.PageUtils;
import com.itpeige.mfmall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author peige
 * @email sunlightcs@gmail.com
 * @date 2021-03-03 21:03:08
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

