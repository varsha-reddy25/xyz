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

import com.test.entity.Product;
import com.test.repository.PRepo;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/product/v1")
public class PController {

	@Autowired
	
	private PRepo repository;
	
	@PostMapping("/create")
	public Product createProduct(@RequestBody Product p)
	{
		return repository.save(p);
	}
	
	@GetMapping("/listall")
	public List<Product> readAllProducts()
	{
		return repository.findAll();
	}
	
	@PutMapping("/update/{id}")
	public List<Product> updateProduct(@RequestBody Product p,@PathVariable("id")int id)
	{
		repository.save(p);
		return repository.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public List<Product> deleteProduct(@PathVariable("id")int id)
	{
		repository.deleteById(id);
		return repository.findAll();
	}
}
