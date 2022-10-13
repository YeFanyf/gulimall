package com.yf.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yf.common.utils.PageUtils;
import com.yf.gulimall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author yefan
 * @email 2394437179@qq.com
 * @date 2022-10-13 19:05:31
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

