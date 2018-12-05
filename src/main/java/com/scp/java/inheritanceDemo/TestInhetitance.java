package com.scp.java.inheritanceDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.scp.java.AppUtil.AppUtil;

public class TestInhetitance 
{
    public static void main( String[] args )
    {
    	
    	SessionFactory sessionFactory=AppUtil.getSessionFactory();
    	Session session=sessionFactory.openSession(); 
    	Transaction tr=session.beginTransaction();
    	Mobile mobi1=new Mobile("samsung", 12000);
    	mobi1.setStudId(1);
    	mobi1.setStudName("jay");
    	mobi1.setMarks(89);
    	Laptop lappy=new Laptop(29000, "Apple");
    	lappy.setStudId(2);;
    	lappy.setStudName("ashu");
    	lappy.setMarks(88);
    	session.save(mobi1);
    	session.save(lappy);
    	session.flush();
    	tr.commit();
    }
}
