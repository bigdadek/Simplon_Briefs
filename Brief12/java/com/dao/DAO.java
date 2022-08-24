package com.dao;

import java.util.List;


public interface DAO<K> {
	
	List<K> getAll();
	K getById(long id);
	boolean add(K k);
	boolean update(K k);
	boolean delete(long id);

}
