package com.inti.SpringBoot_Groupe_Aeroport.repository;

import com.inti.SpringBoot_Groupe_Aeroport.model.Passager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassagerRepository extends JpaRepository<Passager, Integer>{

}
