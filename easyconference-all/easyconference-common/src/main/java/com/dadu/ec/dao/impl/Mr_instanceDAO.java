package com.dadu.ec.dao.impl;

import org.springframework.stereotype.Repository;

import com.dadu.ec.dao.IMr_instance;
import com.dadu.ec.model.Mr_instance;

@Repository
public class Mr_instanceDAO implements IMr_instance {
	
	//@Autowired
	//private SessionFactory sessionFactory;

	public Mr_instanceDAO() {
		super();
	}

	public Mr_instance findById(String id) {
//		Session s = sessionFactory.openSession();
//		try {
//			return (Mr_instance) s.get(Mr_instance.class, id);
//		} catch (HibernateException e) {
//			e.printStackTrace();
//		} finally {
//			s.close();
//		}
		return null;
	}
}
