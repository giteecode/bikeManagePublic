package com.entity.vo;

import com.entity.YonghuchongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 用户充值
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-28 20:59:30
 */
public class YonghuchongzhiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 充值金额
	 */
	
	private Integer chongzhijine;
		
	/**
	 * 充值日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chongzhiriqi;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：充值金额
	 */
	 
	public void setChongzhijine(Integer chongzhijine) {
		this.chongzhijine = chongzhijine;
	}
	
	/**
	 * 获取：充值金额
	 */
	public Integer getChongzhijine() {
		return chongzhijine;
	}
				
	
	/**
	 * 设置：充值日期
	 */
	 
	public void setChongzhiriqi(Date chongzhiriqi) {
		this.chongzhiriqi = chongzhiriqi;
	}
	
	/**
	 * 获取：充值日期
	 */
	public Date getChongzhiriqi() {
		return chongzhiriqi;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
