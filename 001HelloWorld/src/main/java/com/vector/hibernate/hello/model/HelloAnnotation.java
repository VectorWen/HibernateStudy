package com.vector.hibernate.hello.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author VectorHuang
 * @email  642378415@qq.com
 * @date 2016年2月18日 上午11:51:21 
 * @version 1.0
 */

@Entity
public class HelloAnnotation {

	/**
	 * HelloAnnotation 使用注解来测试
	 * 1. @Entity @Id
	 */
	
	private int id;

    private String title;

    public HelloAnnotation() {}

    @Id
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
