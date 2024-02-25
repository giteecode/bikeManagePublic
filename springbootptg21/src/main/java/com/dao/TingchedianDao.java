package com.dao;

import com.entity.TingchedianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TingchedianVO;
import com.entity.view.TingchedianView;


/**
 * 停车点
 * 
 * @author 
 * @email 
 * @date 2021-04-28 20:59:30
 */
public interface TingchedianDao extends BaseMapper<TingchedianEntity> {
	
	List<TingchedianVO> selectListVO(@Param("ew") Wrapper<TingchedianEntity> wrapper);
	
	TingchedianVO selectVO(@Param("ew") Wrapper<TingchedianEntity> wrapper);
	
	List<TingchedianView> selectListView(@Param("ew") Wrapper<TingchedianEntity> wrapper);

	List<TingchedianView> selectListView(Pagination page,@Param("ew") Wrapper<TingchedianEntity> wrapper);
	
	TingchedianView selectView(@Param("ew") Wrapper<TingchedianEntity> wrapper);
	
}
