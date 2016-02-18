package com.vector.hibernate.hello.model;

import javax.persistence.Id;

/** 
 * @author VectorHuang
 * @email  642378415@qq.com
 * @date 2016年2月18日 上午10:11:09 
 * @version 1.0 
 */
public class Hello {

	/**
	 * Hello 使用配置文件来测试
	 * 1. 对应的配置文件是同包名下的Hello.hbm.xml
	 */
	
	private int id;

    private String title;

    public Hello() {}

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
