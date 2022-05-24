package com.inti.SpringBoot_Groupe_Aeroport.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter
{
	@Autowired
	UserDetailsService userDeService;
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception 
	{
		http
		.csrf()
		.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
		.and()
			.authorizeRequests()
			.antMatchers("/login", "/accueil", "/form_utilisateur", "/enrUtilisateur").permitAll()
			.antMatchers("/accueilAdmin/**", "/enrNewAdmin", "/form_newVol").hasRole("ADMIN")
			.anyRequest().authenticated()
			.and()
			.formLogin()
			.loginPage("/accueil")
			.failureUrl("/login?error=true")
			.defaultSuccessUrl("/accueil");
		
	}
	@Bean
	public DaoAuthenticationProvider authProvider() {
	    DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
	    authProvider.setUserDetailsService(userDeService);
	    authProvider.setPasswordEncoder(passwordEncoder());
	    return authProvider;
	}
	
	@Override //configure ctrl+espace pour changer la config par défaut, elle gère le log
	protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	{
		
		auth.authenticationProvider(authProvider());
		//auth.userDetailsService(userDeService).passwordEncoder(passwordEncoder());
		
		
		auth.inMemoryAuthentication()
		
		.withUser("admin").password(passwordEncoder().encode("admin")).roles("ADMIN");
		
		
	}
	@Bean
	public BCryptPasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
}
