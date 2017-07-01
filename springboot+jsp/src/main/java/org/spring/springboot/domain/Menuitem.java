package org.spring.springboot.domain;

import java.io.Serializable;

/**
 * 
 * @author KL
 *
 */
public class Menuitem implements Serializable{
	
	private Long mid;//主键
	private Long pid;//父节点
	private String name;//树上的每一个节点的名称
	private Boolean isParent;//是否为父节点
	private String icon;//图片路径
	
	
	public Long getMid() {
		return mid;
	}
	public void setMid(Long mid) {
		this.mid = mid;
	}
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getIsParent() {
		return isParent;
	}
	public void setIsParent(Boolean isParent) {
		this.isParent = isParent;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
}

