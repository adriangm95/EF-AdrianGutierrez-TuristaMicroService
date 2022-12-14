package com.idat.TuristaMicroService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.TuristaMicroService.model.Turista;

@Repository
public interface TuristaRepository extends JpaRepository<Turista, Integer>{

}
