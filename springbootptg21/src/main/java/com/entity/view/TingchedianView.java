package com.entity.view;

import com.entity.TingchedianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 停车点
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-28 20:59:30
 */
@TableName("tingchedian")
public class TingchedianView  extends TingchedianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TingchedianView(){
	}
 
 	public TingchedianView(TingchedianEntity tingchedianEntity){
 	try {
			BeanUtils.copyProperties(this, tingchedianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
