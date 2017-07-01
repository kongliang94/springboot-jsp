package org.spring.springboot.service.impl;

import java.util.List;

import org.spring.springboot.dao.MenuitemDao;
import org.spring.springboot.domain.Menuitem;
import org.spring.springboot.service.MenuitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuitemServiceImpl implements MenuitemService{

	@Autowired
	MenuitemDao menuitemDao;
	@Override
	public List<Menuitem> findAll() {
		return menuitemDao.findAll();
	}

}
