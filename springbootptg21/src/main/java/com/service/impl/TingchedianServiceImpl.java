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


import com.dao.TingchedianDao;
import com.entity.TingchedianEntity;
import com.service.TingchedianService;
import com.entity.vo.TingchedianVO;
import com.entity.view.TingchedianView;

@Service("tingchedianService")
public class TingchedianServiceImpl extends ServiceImpl<TingchedianDao, TingchedianEntity> implements TingchedianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TingchedianEntity> page = this.selectPage(
                new Query<TingchedianEntity>(params).getPage(),
                new EntityWrapper<TingchedianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TingchedianEntity> wrapper) {
		  Page<TingchedianView> page =new Query<TingchedianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TingchedianVO> selectListVO(Wrapper<TingchedianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TingchedianVO selectVO(Wrapper<TingchedianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TingchedianView> selectListView(Wrapper<TingchedianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TingchedianView selectView(Wrapper<TingchedianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
