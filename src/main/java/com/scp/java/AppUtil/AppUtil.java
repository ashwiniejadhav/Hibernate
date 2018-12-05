package com.scp.java.AppUtil;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class AppUtil {
	private static SessionFactory sessionFactory=null;
	
	public static SessionFactory getSessionFactory(){
		if(sessionFactory==null){
		Configuration conn= new Configuration();
		sessionFactory=conn.configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return sessionFactory;
		
	}

}
