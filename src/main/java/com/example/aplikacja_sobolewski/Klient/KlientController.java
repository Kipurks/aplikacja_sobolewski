package com.example.aplikacja_sobolewski.Klient;


import com.example.aplikacja_sobolewski.Film.FilmController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KlientController {

   public KlientService klientService;
   public KlientController(KlientService klientService){
       this.klientService = klientService;
   }

    @GetMapping("/Klient")
    public List<Klient> getKlient (){
       return klientService.getKlient();
    }
    @GetMapping("/Klient/{id_klienta}")
    public Klient getSingleKlient(@PathVariable long id_klienta){
        return klientService.getSingleFilm(id_klienta);
    }

}
