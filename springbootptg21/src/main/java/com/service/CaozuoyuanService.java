package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaozuoyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaozuoyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaozuoyuanView;


/**
 * 操作员
 *
 * @author 
 * @email 
 * @date 2021-04-28 20:59:30
 */
public interface CaozuoyuanService extends IService<CaozuoyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaozuoyuanVO> selectListVO(Wrapper<CaozuoyuanEntity> wrapper);
   	
   	CaozuoyuanVO selectVO(@Param("ew") Wrapper<CaozuoyuanEntity> wrapper);
   	
   	List<CaozuoyuanView> selectListView(Wrapper<CaozuoyuanEntity> wrapper);
   	
   	CaozuoyuanView selectView(@Param("ew") Wrapper<CaozuoyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaozuoyuanEntity> wrapper);
   	
}

