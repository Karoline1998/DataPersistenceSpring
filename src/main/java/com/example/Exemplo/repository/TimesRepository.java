package com.example.Exemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Exemplo.entidade.Times;

@Repository
public interface TimesRepository extends JpaRepository<Times, Integer>{
}