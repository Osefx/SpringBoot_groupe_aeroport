package com.inti.SpringBoot_Groupe_Aeroport.service;

import com.inti.SpringBoot_Groupe_Aeroport.repository.VolRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.inti.SpringBoot_Groupe_Aeroport.model.Vol;


@Service
public class VolServiceImpl implements VolService {
    @Autowired
    VolRepository volRepository;

    @Override
    public void save(Vol v){

        volRepository.save(v);
    }



}
