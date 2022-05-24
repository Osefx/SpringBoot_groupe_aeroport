package com.inti.SpringBoot_Groupe_Aeroport.service;

import com.inti.SpringBoot_Groupe_Aeroport.repository.PassagerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassagerServiceServiceImpl implements PassagerService {
    @Autowired
    PassagerRepository passagerRepository;
}
