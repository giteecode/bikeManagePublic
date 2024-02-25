package com.entity.vo;

import com.entity.WeixiuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 维修信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-28 20:59:30
 */
public class WeixiuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 单车编号
	 */
	
	private String danchebianhao;
		
	/**
	 * 车辆类型
	 */
	
	private String cheliangleixing;
		
	/**
	 * 状态
	 */
	
	private String zhuangtai;
		
	/**
	 * 维修地址
	 */
	
	private String weixiudizhi;
		
	/**
	 * 故障描述
	 */
	
	private String guzhangmiaoshu;
		
	/**
	 * 维修时间
	 */
	
	private String weixiushijian;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
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
	 * 设置：维修地址
	 */
	 
	public void setWeixiudizhi(String weixiudizhi) {
		this.weixiudizhi = weixiudizhi;
	}
	
	/**
	 * 获取：维修地址
	 */
	public String getWeixiudizhi() {
		return weixiudizhi;
	}
				
	
	/**
	 * 设置：故障描述
	 */
	 
	public void setGuzhangmiaoshu(String guzhangmiaoshu) {
		this.guzhangmiaoshu = guzhangmiaoshu;
	}
	
	/**
	 * 获取：故障描述
	 */
	public String getGuzhangmiaoshu() {
		return guzhangmiaoshu;
	}
				
	
	/**
	 * 设置：维修时间
	 */
	 
	public void setWeixiushijian(String weixiushijian) {
		this.weixiushijian = weixiushijian;
	}
	
	/**
	 * 获取：维修时间
	 */
	public String getWeixiushijian() {
		return weixiushijian;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
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
			
}
