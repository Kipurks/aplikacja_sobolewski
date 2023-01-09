package com.example.aplikacja_sobolewski.Wypozyczenie;

import com.example.aplikacja_sobolewski.Film.Film;
import com.example.aplikacja_sobolewski.Klient.Klient;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Wypozyczenie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id_wypozyczenia;
    public LocalDate data_wypozyczenia;
    public Float cena;

    /*/@ManyToOne
    @JoinColumn(name = "id_klienta")
    public Klient klient;

    @ManyToOne
    @JoinColumn(name = "id_filmu")
    public Film film;/*/



    public Wypozyczenie() {
    }
}
