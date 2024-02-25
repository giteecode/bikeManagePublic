package com.dao;

import com.entity.CaozuoyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaozuoyuanVO;
import com.entity.view.CaozuoyuanView;


/**
 * 操作员
 * 
 * @author 
 * @email 
 * @date 2021-04-28 20:59:30
 */
public interface CaozuoyuanDao extends BaseMapper<CaozuoyuanEntity> {
	
	List<CaozuoyuanVO> selectListVO(@Param("ew") Wrapper<CaozuoyuanEntity> wrapper);
	
	CaozuoyuanVO selectVO(@Param("ew") Wrapper<CaozuoyuanEntity> wrapper);
	
	List<CaozuoyuanView> selectListView(@Param("ew") Wrapper<CaozuoyuanEntity> wrapper);

	List<CaozuoyuanView> selectListView(Pagination page,@Param("ew") Wrapper<CaozuoyuanEntity> wrapper);
	
	CaozuoyuanView selectView(@Param("ew") Wrapper<CaozuoyuanEntity> wrapper);
	
}
