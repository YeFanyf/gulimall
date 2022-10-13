package com.yf.gulimall.product.dao;

import com.yf.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yefan
 * @email 2394437179@qq.com
 * @date 2022-10-13 17:11:49
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
