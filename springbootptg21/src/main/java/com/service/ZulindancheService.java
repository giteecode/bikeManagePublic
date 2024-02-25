package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZulindancheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZulindancheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZulindancheView;


/**
 * 租赁单车
 *
 * @author 
 * @email 
 * @date 2021-04-28 20:59:30
 */
public interface ZulindancheService extends IService<ZulindancheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZulindancheVO> selectListVO(Wrapper<ZulindancheEntity> wrapper);
   	
   	ZulindancheVO selectVO(@Param("ew") Wrapper<ZulindancheEntity> wrapper);
   	
   	List<ZulindancheView> selectListView(Wrapper<ZulindancheEntity> wrapper);
   	
   	ZulindancheView selectView(@Param("ew") Wrapper<ZulindancheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZulindancheEntity> wrapper);
   	
}

