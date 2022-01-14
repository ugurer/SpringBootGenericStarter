package com.ugurer.core.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ugurer.core.model.CoreEntity;

public interface CoreDao<E extends CoreEntity> extends JpaRepository<E, Integer> {
	
	Page<E> findAll(Pageable pageable);
	
	List<E> findAll(Sort sort);	

}
