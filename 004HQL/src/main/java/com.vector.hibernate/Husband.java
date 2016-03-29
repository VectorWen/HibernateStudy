package com.vector.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Author: vector.huang
 * Email: 642378415@qq.com
 * Date: 2016/2/29
 * Description:<p>{TODO: 用一句话描述}
 */
@Entity
@Table
public class Husband {
    private int id;
    private String name;
    private Wife wife;

    @OneToOne
    @JoinColumn(name = "wifeId")
    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    @Id
    @GeneratedValue
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
}
