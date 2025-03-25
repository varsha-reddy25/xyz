package com.test.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dao.StoreDao;
import com.test.entity.Store;
import com.test.repository.StoreRepository;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public class StoreDaoImpl implements StoreDao{

	@Autowired
	private StoreRepository repository;
	
	
	@Override
	public Store addStore(Store cst) {
	
		return repository.save(cst);
	}

	@Override
	public List<Store> readAllStores() {

		return repository.findAll();
	}

	@Override
	public List<Store> updateStore(Store cst) {

		repository.save(cst);
		
		return repository.findAll();
	}

	@Override
	public List<Store> deleteStore(int id) {

		repository.deleteById(id);
		
		return repository.findAll();
	}

	
}
