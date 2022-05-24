package com.inti.SpringBoot_Groupe_Aeroport.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Vol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVol;
    private @NonNull Date depart;
    private @NonNull Date arrivee;
    

    @OneToMany(mappedBy = "vol", targetEntity = Reservation.class, cascade = CascadeType.ALL)
    private List<Reservation> listeReservation;

    @ManyToOne
    @JoinColumn(name = "idAeroportDepart", nullable = false)
    private Aeroport aeroportDepart;

    @ManyToOne
    @JoinColumn(name = "idAeroportArrivee", nullable = false)
    private Aeroport aeroportArrivee;
}
