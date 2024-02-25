package com.dao;

import com.entity.XitongjianjieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XitongjianjieVO;
import com.entity.view.XitongjianjieView;


/**
 * 系统简介
 * 
 * @author 
 * @email 
 * @date 2021-04-28 20:59:30
 */
public interface XitongjianjieDao extends BaseMapper<XitongjianjieEntity> {
	
	List<XitongjianjieVO> selectListVO(@Param("ew") Wrapper<XitongjianjieEntity> wrapper);
	
	XitongjianjieVO selectVO(@Param("ew") Wrapper<XitongjianjieEntity> wrapper);
	
	List<XitongjianjieView> selectListView(@Param("ew") Wrapper<XitongjianjieEntity> wrapper);

	List<XitongjianjieView> selectListView(Pagination page,@Param("ew") Wrapper<XitongjianjieEntity> wrapper);
	
	XitongjianjieView selectView(@Param("ew") Wrapper<XitongjianjieEntity> wrapper);
	
}
