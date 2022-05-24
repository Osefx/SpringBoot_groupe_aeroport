package com.inti.SpringBoot_Groupe_Aeroport.controller;

import com.inti.SpringBoot_Groupe_Aeroport.model.Passager;
import com.inti.SpringBoot_Groupe_Aeroport.model.Role;
import com.inti.SpringBoot_Groupe_Aeroport.model.Utilisateur;
import com.inti.SpringBoot_Groupe_Aeroport.service.PassagerService;
import com.inti.SpringBoot_Groupe_Aeroport.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MainController 
{
	
	@Autowired
	PassagerService passagerService;
    @Autowired
    UserService userService;

    // **** Accueil *****

    @GetMapping("/accueil")
    public String accueil()
    {

        return "accueil";
    }

    @GetMapping("/form_utilisateur")
    public String enrUtilisateur()
    {
        
        return "form_utilisateur";

    }

    @PostMapping("/enrUtilisateur")
    public String saveUtilisateur(@ModelAttribute("utilisateur") Utilisateur u)
    {
    	


    	Role r = new Role("CLIENT");
    	u.setRole(r);
        BCryptPasswordEncoder b = new BCryptPasswordEncoder();
        u.setPassword(b.encode(u.getPassword()));
        
  
        userService.save(u);

        return "redirect:/accueil";
    }
    
	@GetMapping("/form_Reservation_Passager")
    public String ReservationVolPassager()
    {
        
        return "form_Reservation_Passager";

    }
	

	
	@PostMapping("/enrPassager")
	public String saveNewAdmin(@ModelAttribute("passager") Passager p)
	{
		
        passagerService.save(p);

        return "redirect:/accueil";
	}
	


}
