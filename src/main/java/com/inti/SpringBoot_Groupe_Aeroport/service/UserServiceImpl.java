package com.inti.SpringBoot_Groupe_Aeroport.service;



import com.inti.SpringBoot_Groupe_Aeroport.model.Utilisateur;
import com.inti.SpringBoot_Groupe_Aeroport.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	UserRepository userRepository;

	@Override
	public Utilisateur findByUsername(String login) {
		
		return userRepository.findByUsername(login);
	}

	@Override
	public void save(Utilisateur u) {
		userRepository.save(u);
		
	}

}
