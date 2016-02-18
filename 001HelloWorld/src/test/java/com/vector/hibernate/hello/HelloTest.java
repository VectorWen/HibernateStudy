package com.vector.hibernate.hello;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.vector.hibernate.hello.model.Hello;

/**
 * @author VectorHuang
 * @email  642378415@qq.com
 * @date 2016年2月18日 上午11:52:36 
 * @version 1.0
 */
public class HelloTest{
	
	@Test
	public void testSaveHello(){
		Hello hello = new Hello();
		hello.setTitle("Hello Hibernate!!");
		
		/**
		 * 打开很多东西
		 */
		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		
		/**
		 * 开始一个事务
		 */
		session.beginTransaction();
		
		/**
		 * 保存
		 */
		session.save(hello);
		
		/**
		 * 提交事务
		 */
		session.getTransaction().commit();
		
		/**
		 * 关闭很多东西
		 */
		session.close();
		sf.close();
		
	}
	
}
