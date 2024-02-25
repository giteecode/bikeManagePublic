package com.entity.view;

import com.entity.GongxiangdancheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 共享单车
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-28 20:59:30
 */
@TableName("gongxiangdanche")
public class GongxiangdancheView  extends GongxiangdancheEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongxiangdancheView(){
	}
 
 	public GongxiangdancheView(GongxiangdancheEntity gongxiangdancheEntity){
 	try {
			BeanUtils.copyProperties(this, gongxiangdancheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
