package org.spring.springboot.service;

import java.util.List;

import org.spring.springboot.domain.Menuitem;

public interface MenuitemService{

	/**
	 * 获取全部组织机构
	 * @return
	 */
	List<Menuitem> findAll();
}
