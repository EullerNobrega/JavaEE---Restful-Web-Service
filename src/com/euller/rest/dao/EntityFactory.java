package com.euller.rest.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityFactory {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("db");
	EntityManager entityManager = factory.createEntityManager();
}
