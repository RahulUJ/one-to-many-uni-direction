package com.ty.oneToMany.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.oneToMany.dto.Item;

public class ItemDao {
	static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	static EntityManager entityManager = entityManagerFactory.createEntityManager();
	static EntityTransaction transaction = entityManager.getTransaction();
	
	public void saveItem(Item item) {
		transaction.begin();
		entityManager.persist(item);
		System.out.println("Item saved");
		transaction.commit();
	}
}
