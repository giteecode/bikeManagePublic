package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuihaidancheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuihaidancheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuihaidancheView;


/**
 * 归还单车
 *
 * @author 
 * @email 
 * @date 2021-04-28 20:59:30
 */
public interface GuihaidancheService extends IService<GuihaidancheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuihaidancheVO> selectListVO(Wrapper<GuihaidancheEntity> wrapper);
   	
   	GuihaidancheVO selectVO(@Param("ew") Wrapper<GuihaidancheEntity> wrapper);
   	
   	List<GuihaidancheView> selectListView(Wrapper<GuihaidancheEntity> wrapper);
   	
   	GuihaidancheView selectView(@Param("ew") Wrapper<GuihaidancheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuihaidancheEntity> wrapper);
   	
}

