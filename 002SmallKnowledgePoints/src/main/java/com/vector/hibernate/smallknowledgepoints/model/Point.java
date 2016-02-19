package com.vector.hibernate.smallknowledgepoints.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/** 
 * @author VectorHuang
 * @email  642378415@qq.com
 * @date 2016年2月18日 下午3:38:20 
 * @version 1.0 
 */

@Entity
@Table(name="_Point")
public class Point {

	/**
	 * @Table 的默认值是和类名一样的
	 * @Column 的默认值是和属性一样的
	 * getXXX() 不加注解默认是@Basic
	 * 
	 * @Transient 透明的属性，不在数据库里面
	 */
	
	private int id;
	private int x;
	private int y;
	
	@Id
	@Column(name="id")
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Basic
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
}
