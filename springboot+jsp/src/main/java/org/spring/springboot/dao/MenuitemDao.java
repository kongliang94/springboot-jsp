package org.spring.springboot.dao;

import java.util.List;

import org.spring.springboot.domain.Menuitem;

public interface MenuitemDao {

	List<Menuitem> findAll();
}
