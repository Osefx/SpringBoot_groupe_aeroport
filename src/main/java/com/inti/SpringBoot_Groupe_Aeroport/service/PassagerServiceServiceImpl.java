package com.inti.SpringBoot_Groupe_Aeroport.service;

import com.inti.SpringBoot_Groupe_Aeroport.model.Passager;
import com.inti.SpringBoot_Groupe_Aeroport.repository.PassagerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassagerServiceServiceImpl implements PassagerService {
    @Autowired
    PassagerRepository passagerRepository;

	@Override
	public void save(Passager p) {
		// TODO Auto-generated method stub
		
	}
}
