package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheliangleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CheliangleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CheliangleixingView;


/**
 * 车辆类型
 *
 * @author 
 * @email 
 * @date 2021-04-28 20:59:30
 */
public interface CheliangleixingService extends IService<CheliangleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CheliangleixingVO> selectListVO(Wrapper<CheliangleixingEntity> wrapper);
   	
   	CheliangleixingVO selectVO(@Param("ew") Wrapper<CheliangleixingEntity> wrapper);
   	
   	List<CheliangleixingView> selectListView(Wrapper<CheliangleixingEntity> wrapper);
   	
   	CheliangleixingView selectView(@Param("ew") Wrapper<CheliangleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CheliangleixingEntity> wrapper);
   	
}

