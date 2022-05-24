package com.inti.SpringBoot_Groupe_Aeroport.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor @AllArgsConstructor @RequiredArgsConstructor
public class Utilisateur 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUtilisateur;
	private @NonNull String nomUtilisateur;
	private @NonNull String prenomUtilisateur;
	private String telephone;
	private String email;
	@Column(unique = true, nullable = false)
	private @NonNull String username;
	@Column(nullable = false)
	private @NonNull String password;
	
	@OneToMany(mappedBy = "client", targetEntity = Reservation.class, cascade = CascadeType.ALL)
	private List<Reservation> listReservation;

	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idRole")
	private Role role;
}