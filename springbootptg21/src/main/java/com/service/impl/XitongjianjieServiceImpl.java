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


import com.dao.XitongjianjieDao;
import com.entity.XitongjianjieEntity;
import com.service.XitongjianjieService;
import com.entity.vo.XitongjianjieVO;
import com.entity.view.XitongjianjieView;

@Service("xitongjianjieService")
public class XitongjianjieServiceImpl extends ServiceImpl<XitongjianjieDao, XitongjianjieEntity> implements XitongjianjieService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XitongjianjieEntity> page = this.selectPage(
                new Query<XitongjianjieEntity>(params).getPage(),
                new EntityWrapper<XitongjianjieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XitongjianjieEntity> wrapper) {
		  Page<XitongjianjieView> page =new Query<XitongjianjieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XitongjianjieVO> selectListVO(Wrapper<XitongjianjieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XitongjianjieVO selectVO(Wrapper<XitongjianjieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XitongjianjieView> selectListView(Wrapper<XitongjianjieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XitongjianjieView selectView(Wrapper<XitongjianjieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
