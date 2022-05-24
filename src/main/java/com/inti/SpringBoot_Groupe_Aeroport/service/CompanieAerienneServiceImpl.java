package com.inti.SpringBoot_Groupe_Aeroport.service;

import com.inti.SpringBoot_Groupe_Aeroport.repository.CompagnieAerienneRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanieAerienneServiceImpl implements CompagnieAerienneService {
    @Autowired
    CompagnieAerienneRepository compagnieAerienneRepository;
}
