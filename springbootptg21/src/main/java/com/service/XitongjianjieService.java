package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XitongjianjieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XitongjianjieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XitongjianjieView;


/**
 * 系统简介
 *
 * @author 
 * @email 
 * @date 2021-04-28 20:59:30
 */
public interface XitongjianjieService extends IService<XitongjianjieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XitongjianjieVO> selectListVO(Wrapper<XitongjianjieEntity> wrapper);
   	
   	XitongjianjieVO selectVO(@Param("ew") Wrapper<XitongjianjieEntity> wrapper);
   	
   	List<XitongjianjieView> selectListView(Wrapper<XitongjianjieEntity> wrapper);
   	
   	XitongjianjieView selectView(@Param("ew") Wrapper<XitongjianjieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XitongjianjieEntity> wrapper);
   	
}

