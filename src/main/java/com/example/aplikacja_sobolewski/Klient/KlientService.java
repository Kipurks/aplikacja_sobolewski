package com.example.aplikacja_sobolewski.Klient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KlientService {
    private final KlientRepository klientRepository;
    @Autowired
    public KlientService(KlientRepository klientRepository)
    {this.klientRepository = klientRepository;
    }
    public List<Klient> getKlient() {return klientRepository.findAll();}

    public Klient getSingleFilm(long id_klienta) {
        return klientRepository.findById(id_klienta).orElseThrow();}

}
