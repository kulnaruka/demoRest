package com.restproject.demorest;

import javax.xml.bind.annotation.XmlRootElement;

//this is a simple POJO- plain old java objects
@XmlRootElement
public class Alien {
	private String name;
	public Alien() {
		super();
	}
	private int point;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "Alien [names=" + name + ", point=" + point + ", id=" + id + "]";
	}
	
	
}
