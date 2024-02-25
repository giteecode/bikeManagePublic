package com.entity.model;

import com.entity.ZulindancheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 租赁单车
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-28 20:59:30
 */
public class ZulindancheModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	 * 小时价格
	 */
	
	private String xiaoshijiage;
		
	/**
	 * 租赁时长
	 */
	
	private Integer zulinshizhang;
		
	/**
	 * 总价
	 */
	
	private String zongjia;
		
	/**
	 * 租赁时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zulinshijian;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：小时价格
	 */
	 
	public void setXiaoshijiage(String xiaoshijiage) {
		this.xiaoshijiage = xiaoshijiage;
	}
	
	/**
	 * 获取：小时价格
	 */
	public String getXiaoshijiage() {
		return xiaoshijiage;
	}
				
	
	/**
	 * 设置：租赁时长
	 */
	 
	public void setZulinshizhang(Integer zulinshizhang) {
		this.zulinshizhang = zulinshizhang;
	}
	
	/**
	 * 获取：租赁时长
	 */
	public Integer getZulinshizhang() {
		return zulinshizhang;
	}
				
	
	/**
	 * 设置：总价
	 */
	 
	public void setZongjia(String zongjia) {
		this.zongjia = zongjia;
	}
	
	/**
	 * 获取：总价
	 */
	public String getZongjia() {
		return zongjia;
	}
				
	
	/**
	 * 设置：租赁时间
	 */
	 
	public void setZulinshijian(Date zulinshijian) {
		this.zulinshijian = zulinshijian;
	}
	
	/**
	 * 获取：租赁时间
	 */
	public Date getZulinshijian() {
		return zulinshijian;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
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
