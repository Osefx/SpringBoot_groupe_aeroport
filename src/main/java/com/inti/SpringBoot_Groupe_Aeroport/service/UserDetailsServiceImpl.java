package com.inti.SpringBoot_Groupe_Aeroport.service;

import java.util.ArrayList;
import java.util.List;

import com.inti.SpringBoot_Groupe_Aeroport.model.Role;
import com.inti.SpringBoot_Groupe_Aeroport.model.Utilisateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserDetailsServiceImpl implements UserDetailsService
{
	@Autowired
	UserService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
	{
		com.inti.SpringBoot_Groupe_Aeroport.model.Utilisateur user = userService.findByUsername(username);
		if(user == null)
		{
			throw new UsernameNotFoundException("username : " + username + "does not exist");
		}
		return new User(user.getUsername(), user.getPassword(), getListeGrantedAuthority(user));
	}
	
	private List<GrantedAuthority> getListeGrantedAuthority(Utilisateur u)
	{
		List<GrantedAuthority> listeGrantedAuthorities = new ArrayList<GrantedAuthority>();
		Role r = u.getRole();
		listeGrantedAuthorities.add(new SimpleGrantedAuthority(r.getNomRole()));
		
		return listeGrantedAuthorities;
	}

}
