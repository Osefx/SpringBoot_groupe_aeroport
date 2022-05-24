package com.inti.SpringBoot_Groupe_Aeroport.service;

import java.util.List;

import com.inti.SpringBoot_Groupe_Aeroport.model.Vol;

public interface VolService {


public void save(Vol v);
List<Vol> getVols();

}
