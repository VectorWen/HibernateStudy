package com.vector.hibernate;

import com.vector.hibernate.gossip.Gossip;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * Author: vector.huang
 * Email: 642378415@qq.com
 * Date: 2016/2/29
 * Description:<p>{TODO: 用一句话描述}
 */
public class HibernateTest {
    private static SessionFactory sf;

    @BeforeClass
    public static void before(){
        Configuration cfg = new Configuration();
        sf = cfg.configure().buildSessionFactory();
    }

    @AfterClass
    public static void after(){
        sf.close();
    }

    @Test
    public void testHibernate(){
        Session session = sf.openSession();
        session.beginTransaction();
        String hql = "select g,gcc.commentTotal,gll.likeTotal from Gossip g " +
                "full join (" +
                    "select g.id,count(gc.id) as commentTotal from Gossip g " +
                    "left join GossipComment gc with g.id = gc.gossip.id " +
                    "group by g.id " +
                ") gcc with gcc.id = g.id " +
                "full join ( " +
                    " select g.id,count(gl.id) as likeTotal from Gossip g  " +
                    " left join GossipLike gl with g.id = gl.gossip.id " +
                    " group by g.id " +
                ") gll with gll.id = g.id ";
        hql = "select count(gc.id) as commentTotal from Gossip g " +
                "left join g.comments gc " +
                "group by g.id";
        Query query = session.createQuery(hql);
        List<Long> gossips = query.list();
        System.out.println("-----start");
        for(Object gossip : gossips){
            System.out.println("---" + (long)gossip);
        }
        System.out.println("-----end");

        hql = "select g from Gossip g where g.id in (" +
                "select gc.gossip.id from GossipComment gc" +
                ")";
        query = session.createQuery(hql);
        List<Gossip> g = query.list();
        System.out.println("-----start");
        for(Gossip gossip : g){
            System.out.println("---" + gossip.getContent());
        }
        System.out.println("-----end");
        session.getTransaction().commit();
        session.close();
    }

    public static void main1(String[] args) {
        HibernateTest.before();
    }
}
