package com.yf.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yf.common.utils.PageUtils;
import com.yf.gulimall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author yefan
 * @email 2394437179@qq.com
 * @date 2022-10-13 23:36:16
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

