package com.ty.oneToMany.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.oneToMany.dao.MobileDao;
import com.ty.oneToMany.dao.SimDao;
import com.ty.oneToMany.dto.Mobile;
import com.ty.oneToMany.dto.Sim;

public class SaveMobileSim {
	
	static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	static EntityManager entityManager = entityManagerFactory.createEntityManager();
	static EntityTransaction transaction = entityManager.getTransaction();
	
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.setName("Iphone 12Pro");
		mobile.setCost(12000000);
		
		Sim sim1 = new Sim();
		sim1.setProvider("Jio");
		sim1.setImrc(12345);
		
		Sim sim2 = new Sim();
		sim2.setProvider("Airtel");
		sim2.setImrc(74185);
		
		List<Sim> sims = new ArrayList(); 
		sims.add(sim1);
		sims.add(sim2);
		
		mobile.setSims(sims);
		
		transaction.begin();
		entityManager.persist(mobile);
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		transaction.commit();
	}

}
