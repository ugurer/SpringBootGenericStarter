package com.ugurer.core.service;

import java.util.List;

import com.ugurer.core.model.CoreEntity;
import com.ugurer.core.repo.CoreDao;

public interface CoreService<E extends CoreEntity> {

	List<E> getAll();

	E getById(int id);
	
	E saveOrUpdate(E e);
	
	void delete(int id);

	CoreDao<E> getDao();
}
