package com.CRUD.CRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRUD.CRUD.entity.product;

public interface ProductRepository extends JpaRepository <product, Integer>{

}
