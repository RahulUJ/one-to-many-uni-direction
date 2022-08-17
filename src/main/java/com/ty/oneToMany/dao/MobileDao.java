package com.ty.oneToMany.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.oneToMany.dto.Mobile;

public class MobileDao {
	
	static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	static EntityManager entityManager = entityManagerFactory.createEntityManager();
	static EntityTransaction transaction = entityManager.getTransaction();
	
	public void addMobile(Mobile mobile) {
		transaction.begin();
		entityManager.persist(mobile);
		System.out.println("Mobile saved");
		transaction.commit();
	}


}
