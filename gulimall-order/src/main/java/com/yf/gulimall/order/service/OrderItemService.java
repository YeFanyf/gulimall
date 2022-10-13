package com.yf.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yf.common.utils.PageUtils;
import com.yf.gulimall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author yefan
 * @email 2394437179@qq.com
 * @date 2022-10-13 23:36:16
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

