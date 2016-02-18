package com.vector.hibernate.hello;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.vector.hibernate.hello.model.HelloAnnotation;

/**
 * @author VectorHuang
 * @email  642378415@qq.com
 * @date 2016年2月18日 上午11:52:29 
 * @version 1.0
 */

public class HelloAnnotationTest{
	
	@Test
	public void testSaveHelloAnnotation(){
		HelloAnnotation helloAnnotation = new HelloAnnotation();
		helloAnnotation.setTitle("Hello Annotation Hibernate!!");
		
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
		session.save(helloAnnotation);
		
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
