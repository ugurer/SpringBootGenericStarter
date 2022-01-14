package com.ugurer.core.service.impl;

import java.util.List;

import com.ugurer.core.model.CoreEntity;
import com.ugurer.core.repo.CoreDao;
import com.ugurer.core.service.CoreService;

public class CoreServiceImpl<E extends CoreEntity> implements CoreService<E> {

	private CoreDao<E> coreDao;

	public CoreServiceImpl(CoreDao<E> coreDao) {
		this.coreDao = coreDao;
	}

	@Override
	public List<E> getAll() {
		return this.coreDao.findAll();
	}

	@Override
	public E getById(int id) {
		return this.coreDao.getById(id);
	}
	
	@Override
	public E saveOrUpdate(E e) {
		return this.coreDao.save(e);
	}

	@Override
	public void delete(int id) {
		this.coreDao.deleteById(id);

	}

	
	@Override
	public CoreDao<E> getDao() {
		return this.coreDao;
	}
	
	

}
