package com.dao;

import com.entity.YonghuchongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghuchongzhiVO;
import com.entity.view.YonghuchongzhiView;


/**
 * 用户充值
 * 
 * @author 
 * @email 
 * @date 2021-04-28 20:59:30
 */
public interface YonghuchongzhiDao extends BaseMapper<YonghuchongzhiEntity> {
	
	List<YonghuchongzhiVO> selectListVO(@Param("ew") Wrapper<YonghuchongzhiEntity> wrapper);
	
	YonghuchongzhiVO selectVO(@Param("ew") Wrapper<YonghuchongzhiEntity> wrapper);
	
	List<YonghuchongzhiView> selectListView(@Param("ew") Wrapper<YonghuchongzhiEntity> wrapper);

	List<YonghuchongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<YonghuchongzhiEntity> wrapper);
	
	YonghuchongzhiView selectView(@Param("ew") Wrapper<YonghuchongzhiEntity> wrapper);
	
}
