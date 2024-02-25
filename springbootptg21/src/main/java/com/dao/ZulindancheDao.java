package com.dao;

import com.entity.ZulindancheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZulindancheVO;
import com.entity.view.ZulindancheView;


/**
 * 租赁单车
 * 
 * @author 
 * @email 
 * @date 2021-04-28 20:59:30
 */
public interface ZulindancheDao extends BaseMapper<ZulindancheEntity> {
	
	List<ZulindancheVO> selectListVO(@Param("ew") Wrapper<ZulindancheEntity> wrapper);
	
	ZulindancheVO selectVO(@Param("ew") Wrapper<ZulindancheEntity> wrapper);
	
	List<ZulindancheView> selectListView(@Param("ew") Wrapper<ZulindancheEntity> wrapper);

	List<ZulindancheView> selectListView(Pagination page,@Param("ew") Wrapper<ZulindancheEntity> wrapper);
	
	ZulindancheView selectView(@Param("ew") Wrapper<ZulindancheEntity> wrapper);
	
}
