package com.test.service.impl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.StoreDao;
import com.test.entity.Store;
import com.test.service.StoreService;

@Service
public class StoreServiceimpl implements StoreService {

	@Autowired
	private StoreDao storeDao;
	@Override
	public Store addStore(Store st) {
		try
		{
			if(st!=null)
			{
				storeDao.addStore(st);
			}
		}
		catch(RuntimeException e)
		{
			e.printStackTrace();
		}
		return st;
	}

	@Override
	public List<Store> readAllStores() {
		List<Store>list= storeDao.readAllStores();
		if(list.size()<0)
		{
			System.out.println("no content");
		}
		return list;
	}

	@Override
	public List<Store> updateStore(Store st) {
		try
		{
			if(st!=null)
			{
				storeDao.updateStore(st);
			}
		}
		catch(RuntimeException e)
		{
			e.printStackTrace();
		}
		
		
		return storeDao.readAllStores();
	}

	@Override
	public List<Store> deleteStore(int id) {
		try
		{
			if(id!=0)
			{
				storeDao.deleteStore(id);
			}
		}
		catch(RuntimeException e)
		{
			e.printStackTrace();
		}
		
		return storeDao.readAllStores();
	}


	
}
