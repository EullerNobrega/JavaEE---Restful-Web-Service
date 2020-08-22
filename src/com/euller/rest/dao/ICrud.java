package com.euller.rest.dao;

import java.util.List;

public interface ICrud<T> {
	public void add(T t);
	public List<T> list();
	public T get(int id);
	public void remove(T t);
	public void remove(int id);
}
