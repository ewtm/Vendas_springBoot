package com.github.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
