package com.inti.SpringBoot_Groupe_Aeroport.repository;



import com.inti.SpringBoot_Groupe_Aeroport.model.Utilisateur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Utilisateur, Integer>
{
	
	Utilisateur findByUsername(String username);
	
//	@Query("FROM User u WHERE u.username=:login or u.email=:login")
//	User findbByUsernameOrEmail(@Param("login") String login);
}
