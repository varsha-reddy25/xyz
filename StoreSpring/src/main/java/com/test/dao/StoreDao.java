package com.test.dao;

import java.util.List;

import com.test.entity.Store;

public interface StoreDao {

	public Store addStore(Store st);
	
	public List<Store> readAllStores();
	
	public List<Store> updateStore(Store st);
	
	public List<Store> deleteStore(int id);

	
	
	
}
