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
public class CompagnieAerienne {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int CompagnieAerienne;
private @NonNull String nom;

 
// @ManyToMany
// @JoinTable(name="Vol_CompagnieAerienne",
//joinColumns = @JoinColumn(name="idCompagnie"),
//inverseJoinColumns = @JoinColumn(name="idVol"))
//private List<Vol> listeVol;


}
