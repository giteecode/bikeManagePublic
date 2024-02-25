package com.entity.view;

import com.entity.DiscussgongxiangdancheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 共享单车评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-28 20:59:30
 */
@TableName("discussgongxiangdanche")
public class DiscussgongxiangdancheView  extends DiscussgongxiangdancheEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussgongxiangdancheView(){
	}
 
 	public DiscussgongxiangdancheView(DiscussgongxiangdancheEntity discussgongxiangdancheEntity){
 	try {
			BeanUtils.copyProperties(this, discussgongxiangdancheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
