package org.spring.springboot.domain;

import java.io.Serializable;

public class User implements Serializable{

	private Long id;
	private String name;
	private Long depId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getDepId() {
		return depId;
	}
	public void setDepId(Long depId) {
		this.depId = depId;
	}
}
