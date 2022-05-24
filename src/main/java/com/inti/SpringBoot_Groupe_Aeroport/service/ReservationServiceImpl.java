package com.inti.SpringBoot_Groupe_Aeroport.service;

import com.inti.SpringBoot_Groupe_Aeroport.repository.ReservationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {
    @Autowired
    ReservationRepository reservationRepository;
}
