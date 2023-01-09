package com.example.aplikacja_sobolewski.Wypozyczenie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WypozyczenieRepository extends JpaRepository<Wypozyczenie, Long> {

}


