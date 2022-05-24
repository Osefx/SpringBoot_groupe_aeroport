package com.inti.SpringBoot_Groupe_Aeroport.service;

import com.inti.SpringBoot_Groupe_Aeroport.model.Utilisateur;

public interface UserService 
{
	Utilisateur findByUsername(String login);
	void save(Utilisateur u);
}
