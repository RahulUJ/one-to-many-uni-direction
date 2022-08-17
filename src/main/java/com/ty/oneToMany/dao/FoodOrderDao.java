package com.ty.oneToMany.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.oneToMany.dto.FoodOrder;

public class FoodOrderDao {

	static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	static EntityManager entityManager = entityManagerFactory.createEntityManager();
	static EntityTransaction transaction = entityManager.getTransaction();
	
	public void saveFoodOrder(FoodOrder foodOrder) {
		transaction.begin();
		entityManager.persist(foodOrder);
		System.out.println("Order saved");
		transaction.commit();
	}

}
