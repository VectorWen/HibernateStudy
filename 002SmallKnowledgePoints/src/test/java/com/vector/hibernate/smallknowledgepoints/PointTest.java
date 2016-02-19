package com.vector.hibernate.smallknowledgepoints;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.vector.hibernate.smallknowledgepoints.model.Point;

/**
 * 
 * @author VectorHuang
 * @email  642378415@qq.com
 * @date 2016年2月18日 下午3:41:10 
 * @version 1.0
 */
public class PointTest{
	private static SessionFactory sf;
	
	@BeforeClass
	public static void Before(){
		Configuration cfg = new Configuration();
		sf = cfg.configure().buildSessionFactory();
	}
	
	@Test
	public void testPoint(){
		Point point = new Point();
		point.setX(1);
		point.setY(2);
		
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(point);
		session.getTransaction().commit();
		session.close();
		
	}
	
	@AfterClass
	public static void after(){
		sf.close();
	}
	
}
