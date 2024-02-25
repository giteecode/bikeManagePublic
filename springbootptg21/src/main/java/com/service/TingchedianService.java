package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TingchedianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TingchedianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TingchedianView;


/**
 * 停车点
 *
 * @author 
 * @email 
 * @date 2021-04-28 20:59:30
 */
public interface TingchedianService extends IService<TingchedianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TingchedianVO> selectListVO(Wrapper<TingchedianEntity> wrapper);
   	
   	TingchedianVO selectVO(@Param("ew") Wrapper<TingchedianEntity> wrapper);
   	
   	List<TingchedianView> selectListView(Wrapper<TingchedianEntity> wrapper);
   	
   	TingchedianView selectView(@Param("ew") Wrapper<TingchedianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TingchedianEntity> wrapper);
   	
}

