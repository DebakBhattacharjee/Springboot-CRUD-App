package com.CRUD.CRUD.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.CRUD.CRUD.repository.ProductRepository;

public class ProductService {
  @Autowired
  private ProductRepository repository;
  
}
