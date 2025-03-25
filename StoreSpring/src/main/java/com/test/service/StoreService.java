package com.test.service;

import java.util.List;



import com.test.entity.Store;



public interface StoreService {

	public Store addStore(Store st);
	
public List<Store> readAllStores();
	
	public List<Store> updateStore(Store cst);
	
	public List<Store> deleteStore(int id);
}
