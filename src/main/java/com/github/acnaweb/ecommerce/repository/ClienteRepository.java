package com.github.acnaweb.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.acnaweb.ecommerce.model.Cliente;

@Repository
public interface ClienteRepository 
	extends JpaRepository<Cliente, Long> {

}
