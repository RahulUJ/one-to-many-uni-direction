package com.ty.oneToMany.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.oneToMany.dto.Sim;

public class SimDao {
	
	static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	static EntityManager entityManager = entityManagerFactory.createEntityManager();
	static EntityTransaction transaction = entityManager.getTransaction();
	
	public void saveSim(Sim sim) {
		transaction.begin();
		entityManager.persist(sim);
		System.out.println("Sim saved");
		transaction.commit();
	}


}
