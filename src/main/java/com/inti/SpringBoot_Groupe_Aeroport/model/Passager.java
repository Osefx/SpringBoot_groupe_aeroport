package com.inti.SpringBoot_Groupe_Aeroport.model;

import java.util.List;

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
public class Passager {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPassager;
    private @NonNull String nomPassager;
    private @NonNull String prenomPassager;

    @OneToMany(mappedBy = "passager", targetEntity = Reservation.class, cascade = CascadeType.ALL)
    private List<Reservation> listReservation;


}
