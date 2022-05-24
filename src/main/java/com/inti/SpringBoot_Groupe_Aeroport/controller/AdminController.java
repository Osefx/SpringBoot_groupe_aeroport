package com.inti.SpringBoot_Groupe_Aeroport.controller;

import com.inti.SpringBoot_Groupe_Aeroport.model.Utilisateur;
import com.inti.SpringBoot_Groupe_Aeroport.service.UserService;
import com.inti.SpringBoot_Groupe_Aeroport.service.VolService;
import com.inti.SpringBoot_Groupe_Aeroport.model.Role;
import com.inti.SpringBoot_Groupe_Aeroport.model.Vol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import ch.qos.logback.classic.pattern.Util;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class AdminController {
	@Autowired
	UserService userService;

	@Autowired
	VolService volService;

	@GetMapping("/accueilAdmin")
	public String accueilAdmin() {

		return "accueilAdmin";
	}

	@PostMapping("/enrAdmin")
	public String saveAdmin(@ModelAttribute("admin") Utilisateur u) {
		Role r = new Role("ADMIN");
		BCryptPasswordEncoder b = new BCryptPasswordEncoder();
		u.setPassword(b.encode(u.getPassword()));

		userService.save(u);

		return "redirect:/accueil";
	}

	@GetMapping("/AfficherVols")
	public String afficherVols(Model m) {
		m.addAttribute("listeVol", volService.getVols());
		return "AfficherVols";
	}
	
	@GetMapping("/form_newVol")
    public String EnregistrementNewVol(Vol vol)
    {
        
        return "form_newVol";

    }

	@PostMapping("/enrNewVol")
	public String enrNewVol(Vol vol) 
	{
		
        volService.save(vol);
		return "redirect:/accueilAdmin";
	}

	@GetMapping("/form_NewAdmin")
	public String form_NewAdmin()
	{
		return "form_NewAdmin";
	}

	@PostMapping("/enrNewAdmin")
	public String saveNewAdmin(@ModelAttribute("utlisateur") Utilisateur u)
	{
		Role r = new Role("ADMIN");
    	u.setRole(r);
        BCryptPasswordEncoder b = new BCryptPasswordEncoder();
        u.setPassword(b.encode(u.getPassword()));
        
  
        userService.save(u);

        return "redirect:/accueil";
	}


}
