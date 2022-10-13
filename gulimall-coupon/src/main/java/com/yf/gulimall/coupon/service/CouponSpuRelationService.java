package com.yf.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yf.common.utils.PageUtils;
import com.yf.gulimall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author yefan
 * @email 2394437179@qq.com
 * @date 2022-10-13 21:01:57
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

