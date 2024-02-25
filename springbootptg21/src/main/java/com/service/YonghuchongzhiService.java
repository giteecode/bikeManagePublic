package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuchongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghuchongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghuchongzhiView;


/**
 * 用户充值
 *
 * @author 
 * @email 
 * @date 2021-04-28 20:59:30
 */
public interface YonghuchongzhiService extends IService<YonghuchongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghuchongzhiVO> selectListVO(Wrapper<YonghuchongzhiEntity> wrapper);
   	
   	YonghuchongzhiVO selectVO(@Param("ew") Wrapper<YonghuchongzhiEntity> wrapper);
   	
   	List<YonghuchongzhiView> selectListView(Wrapper<YonghuchongzhiEntity> wrapper);
   	
   	YonghuchongzhiView selectView(@Param("ew") Wrapper<YonghuchongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghuchongzhiEntity> wrapper);
   	
}

