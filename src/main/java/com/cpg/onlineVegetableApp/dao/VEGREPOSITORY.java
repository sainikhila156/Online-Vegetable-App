package com.cpg.onlineVegetableApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cpg.onlineVegetableApp.entities.VegetableDTO;

@Repository
public interface VEGREPOSITORY extends JpaRepository<VegetableDTO, Integer>{

}
