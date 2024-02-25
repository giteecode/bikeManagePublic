package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussgongxiangdancheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussgongxiangdancheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussgongxiangdancheView;


/**
 * 共享单车评论表
 *
 * @author 
 * @email 
 * @date 2021-04-28 20:59:30
 */
public interface DiscussgongxiangdancheService extends IService<DiscussgongxiangdancheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussgongxiangdancheVO> selectListVO(Wrapper<DiscussgongxiangdancheEntity> wrapper);
   	
   	DiscussgongxiangdancheVO selectVO(@Param("ew") Wrapper<DiscussgongxiangdancheEntity> wrapper);
   	
   	List<DiscussgongxiangdancheView> selectListView(Wrapper<DiscussgongxiangdancheEntity> wrapper);
   	
   	DiscussgongxiangdancheView selectView(@Param("ew") Wrapper<DiscussgongxiangdancheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussgongxiangdancheEntity> wrapper);
   	
}

