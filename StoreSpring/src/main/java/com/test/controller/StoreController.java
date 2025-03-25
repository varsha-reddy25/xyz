package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Store;
import com.test.service.StoreService;



@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/store/v1")
public class StoreController {

	@Autowired
	private StoreService service;
	
	@PostMapping("/create")
	public Store createCustomer(@RequestBody Store cst)
	{
		return service.addStore(cst);
	}
	
	@GetMapping("/listall")
	public List<Store> listAllCustomers()
	{
		return service.readAllStores();
	}
	
	@PutMapping("/update/{id}")
	public List<Store> updateCustomer(@RequestBody Store cst,@PathVariable("id")int id )
	{
		cst.setId(id);
		return service.updateStore(cst);
		
	}
	@DeleteMapping("/delete/{id}")
	public List<Store> deleteCustomer(@PathVariable("id")int id )
	{
		return service.deleteStore(id);
	}
}