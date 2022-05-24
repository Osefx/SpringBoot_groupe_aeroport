package com.inti.SpringBoot_Groupe_Aeroport.model;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor @RequiredArgsConstructor @AllArgsConstructor
public class Passager {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPassager;
    private @NonNull String nomPassager;
    private @NonNull String prenomPassager;
    private @NonNull int agePassager;
    @Pattern(regexp="^0[1-9]{1}$[\\.[0-9]{2}]{4}",message="saisir telephone au format 0X.XX.XX.XX.XX")
    private @NonNull String telephonePassager;
    private @Email 
    String emailPassager;
    private @NonNull String adressePassager;
    
    
    @OneToMany(mappedBy = "passager", targetEntity = Reservation.class, cascade = CascadeType.ALL)
    private List<Reservation> listReservation;


}
