package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeixiuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeixiuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeixiuxinxiView;


/**
 * 维修信息
 *
 * @author 
 * @email 
 * @date 2021-04-28 20:59:30
 */
public interface WeixiuxinxiService extends IService<WeixiuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeixiuxinxiVO> selectListVO(Wrapper<WeixiuxinxiEntity> wrapper);
   	
   	WeixiuxinxiVO selectVO(@Param("ew") Wrapper<WeixiuxinxiEntity> wrapper);
   	
   	List<WeixiuxinxiView> selectListView(Wrapper<WeixiuxinxiEntity> wrapper);
   	
   	WeixiuxinxiView selectView(@Param("ew") Wrapper<WeixiuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeixiuxinxiEntity> wrapper);
   	
}

