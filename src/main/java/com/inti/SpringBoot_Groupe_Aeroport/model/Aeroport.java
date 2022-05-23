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
public class Aeroport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAeroport;
    @Column(unique = true)
    private @NonNull String nomAeroport;
    private @NonNull String villeAeroport;

    @OneToMany(mappedBy = "aeroportDepart", targetEntity = Vol.class, cascade = CascadeType.ALL)
    private List<Vol> listeVolsDepart;

    @OneToMany(mappedBy = "aeroportArrivee", targetEntity = Vol.class, cascade = CascadeType.ALL)
    private List<Vol> listeVolsArrivee;
}

