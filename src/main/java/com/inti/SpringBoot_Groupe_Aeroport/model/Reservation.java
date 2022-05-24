package com.inti.SpringBoot_Groupe_Aeroport.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor @RequiredArgsConstructor @AllArgsConstructor
public class Reservation {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idReservation;
    private @NonNull int numero;

    @ManyToOne
    @JoinColumn(name="idVol", nullable = false)
    private Vol vol;

    @ManyToOne
    @JoinColumn(name="idUtilisateur", nullable = false)
    private Utilisateur client;

    @ManyToOne
    @JoinColumn(name="idPassager", nullable = false)
    private Passager passager;
}
