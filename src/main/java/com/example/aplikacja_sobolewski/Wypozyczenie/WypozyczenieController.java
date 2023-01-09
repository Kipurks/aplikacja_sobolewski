package com.example.aplikacja_sobolewski.Wypozyczenie;


import com.example.aplikacja_sobolewski.Klient.KlientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class WypozyczenieController {
    public  WypozyczenieService wypozyczenieService;
    public WypozyczenieController(WypozyczenieService wypozyczenieService){
        this.wypozyczenieService = wypozyczenieService;}

    @GetMapping("/Wypozyczenie")
    public List<Wypozyczenie> getWypozyczenie() {return wypozyczenieService.getWypozyczenie();}
    @GetMapping("/Wypozyczenie/{id_wypozyczenia}")
    public Wypozyczenie getSingleWypozyczenie(@PathVariable Long id_wypozyczenia) {
        throw new IllegalArgumentException("Not implemented yet!");

    }

}
