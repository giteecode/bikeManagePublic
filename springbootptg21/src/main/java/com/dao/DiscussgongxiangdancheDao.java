package com.dao;

import com.entity.DiscussgongxiangdancheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussgongxiangdancheVO;
import com.entity.view.DiscussgongxiangdancheView;


/**
 * 共享单车评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-28 20:59:30
 */
public interface DiscussgongxiangdancheDao extends BaseMapper<DiscussgongxiangdancheEntity> {
	
	List<DiscussgongxiangdancheVO> selectListVO(@Param("ew") Wrapper<DiscussgongxiangdancheEntity> wrapper);
	
	DiscussgongxiangdancheVO selectVO(@Param("ew") Wrapper<DiscussgongxiangdancheEntity> wrapper);
	
	List<DiscussgongxiangdancheView> selectListView(@Param("ew") Wrapper<DiscussgongxiangdancheEntity> wrapper);

	List<DiscussgongxiangdancheView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussgongxiangdancheEntity> wrapper);
	
	DiscussgongxiangdancheView selectView(@Param("ew") Wrapper<DiscussgongxiangdancheEntity> wrapper);
	
}
