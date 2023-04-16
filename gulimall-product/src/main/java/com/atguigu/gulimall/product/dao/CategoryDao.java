package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author cc
 * @email sun@.com
 * @date 2023-04-16 22:41:10
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}