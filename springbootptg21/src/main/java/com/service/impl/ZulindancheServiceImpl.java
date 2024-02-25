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


import com.dao.ZulindancheDao;
import com.entity.ZulindancheEntity;
import com.service.ZulindancheService;
import com.entity.vo.ZulindancheVO;
import com.entity.view.ZulindancheView;

@Service("zulindancheService")
public class ZulindancheServiceImpl extends ServiceImpl<ZulindancheDao, ZulindancheEntity> implements ZulindancheService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZulindancheEntity> page = this.selectPage(
                new Query<ZulindancheEntity>(params).getPage(),
                new EntityWrapper<ZulindancheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZulindancheEntity> wrapper) {
		  Page<ZulindancheView> page =new Query<ZulindancheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZulindancheVO> selectListVO(Wrapper<ZulindancheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZulindancheVO selectVO(Wrapper<ZulindancheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZulindancheView> selectListView(Wrapper<ZulindancheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZulindancheView selectView(Wrapper<ZulindancheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
