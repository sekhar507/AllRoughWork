package com.mkyong.common;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class App {
	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + MySQL");

		SessionFactory sf = new AnnotationConfiguration().configure()
				.buildSessionFactory();
		Session session = sf.openSession();
		
		String sql = "select * from student";
		SQLQuery query = session.createSQLQuery(sql);
		
		query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		List studentList = query.list();
		Iterator iterator = studentList.iterator();
		while (iterator.hasNext()) {
			Map Student = (Map) iterator.next();
			System.out.println("Student details are " + Student.get("name")+ "------->" + Student.get("city"));
		}

		/*
		 * session.beginTransaction(); Student st = new Student();
		 * st.setName("Mahesh"); st.setCity("FL");
		 * 
		 * session.save(st); session.getTransaction().commit();
		 */

	}
}
