package com.ty.oneToMany.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.oneToMany.dto.Organisation;

public class OrganisationDao {
	static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	static EntityManager entityManager = entityManagerFactory.createEntityManager();
	static EntityTransaction transaction = entityManager.getTransaction();
	
	public void saveCompany(Organisation organisation) {
		transaction.begin();
		entityManager.persist(organisation);
		System.out.println("Organization saved");
		transaction.commit();
	}
}
