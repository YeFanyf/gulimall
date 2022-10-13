package com.yf.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yf.common.utils.PageUtils;
import com.yf.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author yefan
 * @email 2394437179@qq.com
 * @date 2022-10-13 21:01:57
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

