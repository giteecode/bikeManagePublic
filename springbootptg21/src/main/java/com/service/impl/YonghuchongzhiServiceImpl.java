package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YonghuchongzhiDao;
import com.entity.YonghuchongzhiEntity;
import com.service.YonghuchongzhiService;
import com.entity.vo.YonghuchongzhiVO;
import com.entity.view.YonghuchongzhiView;

@Service("yonghuchongzhiService")
public class YonghuchongzhiServiceImpl extends ServiceImpl<YonghuchongzhiDao, YonghuchongzhiEntity> implements YonghuchongzhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghuchongzhiEntity> page = this.selectPage(
                new Query<YonghuchongzhiEntity>(params).getPage(),
                new EntityWrapper<YonghuchongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghuchongzhiEntity> wrapper) {
		  Page<YonghuchongzhiView> page =new Query<YonghuchongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghuchongzhiVO> selectListVO(Wrapper<YonghuchongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghuchongzhiVO selectVO(Wrapper<YonghuchongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghuchongzhiView> selectListView(Wrapper<YonghuchongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghuchongzhiView selectView(Wrapper<YonghuchongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
