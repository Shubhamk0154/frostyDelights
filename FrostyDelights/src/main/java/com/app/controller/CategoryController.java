package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.CategoryService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/category")

public class CategoryController {
	
	@Autowired
	private CategoryService catService;
	
	@GetMapping
	public ResponseEntity<?> getAllCategories()
	{
		return ResponseEntity.ok(catService.getAllCategories());
	}
	
	
	@GetMapping("/addProducts/{id}")
	public ResponseEntity<?> addProductByCategory(@PathVariable("id") long id)
	
	{
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(catService.addProductsByCategory());
		
	  	
		
     }

}
