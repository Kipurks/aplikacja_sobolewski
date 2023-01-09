package com.example.aplikacja_sobolewski.Wypozyczenie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class WypozyczenieService {

     public final WypozyczenieRepository wypozyczenieRepository;
     @Autowired

    public WypozyczenieService(WypozyczenieRepository wypozyczenieRepository) {this.wypozyczenieRepository = wypozyczenieRepository;}
    public List<Wypozyczenie>getWypozyczenie(){return wypozyczenieRepository.findAll();}

    public Wypozyczenie getSingleWypozyczenie( Long id_wypozyczenia){return wypozyczenieRepository.findById(id_wypozyczenia).orElseThrow();}
}
