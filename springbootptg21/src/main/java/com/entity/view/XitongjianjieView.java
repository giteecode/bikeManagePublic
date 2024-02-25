package com.entity.view;

import com.entity.XitongjianjieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 系统简介
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-28 20:59:30
 */
@TableName("xitongjianjie")
public class XitongjianjieView  extends XitongjianjieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XitongjianjieView(){
	}
 
 	public XitongjianjieView(XitongjianjieEntity xitongjianjieEntity){
 	try {
			BeanUtils.copyProperties(this, xitongjianjieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
