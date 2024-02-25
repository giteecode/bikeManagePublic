package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 共享单车
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-28 20:59:30
 */
@TableName("gongxiangdanche")
public class GongxiangdancheEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GongxiangdancheEntity() {
		
	}
	
	public GongxiangdancheEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 单车编号
	 */
					
	private String danchebianhao;
	
	/**
	 * 停车点
	 */
					
	private String tingchedian;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 车辆类型
	 */
					
	private String cheliangleixing;
	
	/**
	 * 单车图片
	 */
					
	private String danchetupian;
	
	/**
	 * 小时价格
	 */
					
	private Integer xiaoshijiage;
	
	/**
	 * 状态
	 */
					
	private String zhuangtai;
	
	/**
	 * 单车详情
	 */
					
	private String danchexiangqing;
	
	/**
	 * 实时时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date shishishijian;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：单车编号
	 */
	public void setDanchebianhao(String danchebianhao) {
		this.danchebianhao = danchebianhao;
	}
	/**
	 * 获取：单车编号
	 */
	public String getDanchebianhao() {
		return danchebianhao;
	}
	/**
	 * 设置：停车点
	 */
	public void setTingchedian(String tingchedian) {
		this.tingchedian = tingchedian;
	}
	/**
	 * 获取：停车点
	 */
	public String getTingchedian() {
		return tingchedian;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：车辆类型
	 */
	public void setCheliangleixing(String cheliangleixing) {
		this.cheliangleixing = cheliangleixing;
	}
	/**
	 * 获取：车辆类型
	 */
	public String getCheliangleixing() {
		return cheliangleixing;
	}
	/**
	 * 设置：单车图片
	 */
	public void setDanchetupian(String danchetupian) {
		this.danchetupian = danchetupian;
	}
	/**
	 * 获取：单车图片
	 */
	public String getDanchetupian() {
		return danchetupian;
	}
	/**
	 * 设置：小时价格
	 */
	public void setXiaoshijiage(Integer xiaoshijiage) {
		this.xiaoshijiage = xiaoshijiage;
	}
	/**
	 * 获取：小时价格
	 */
	public Integer getXiaoshijiage() {
		return xiaoshijiage;
	}
	/**
	 * 设置：状态
	 */
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
	/**
	 * 设置：单车详情
	 */
	public void setDanchexiangqing(String danchexiangqing) {
		this.danchexiangqing = danchexiangqing;
	}
	/**
	 * 获取：单车详情
	 */
	public String getDanchexiangqing() {
		return danchexiangqing;
	}
	/**
	 * 设置：实时时间
	 */
	public void setShishishijian(Date shishishijian) {
		this.shishishijian = shishishijian;
	}
	/**
	 * 获取：实时时间
	 */
	public Date getShishishijian() {
		return shishishijian;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
