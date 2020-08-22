package com.euller.rest.dao;

import java.util.List;

import com.euller.rest.model.User;

public class DAOGenerico<T> implements ICrud<T> {
	EntityFactory persistence = new EntityFactory();

	@Override
	public void add(T t) {
		persistence.entityManager.persist(t);

	}

	@Override
	public List<T> list() {
		List<T> resultList = persistence.entityManager.createQuery("SELECT * FROM " + getClass().getCanonicalName()).getResultList();
		return resultList;
	}

	@Override
	public T get(int id) {
		Object singleResult = persistence.entityManager
				.createQuery("SELECT * FROM" + getClass().getCanonicalName() + " t  WHERE t.id LIKE :ID")
				.setParameter("ID", id)
				.getSingleResult();
		return (T) singleResult;
	}

	@Override
	public void remove(int id) {
		T t = get(id);
		persistence.entityManager.remove(t);

	}

	@Override
	public void remove(T t) {
		// TODO Auto-generated method stub
		
	}

}
