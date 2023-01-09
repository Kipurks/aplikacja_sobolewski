package com.example.aplikacja_sobolewski.Klient;

import com.example.aplikacja_sobolewski.Wypozyczenie.Wypozyczenie;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Klient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id_klienta;
    public String name;
    @Column(name="last_name")
    public String lastName; //lastName
    public String email;
    public String username;
    /*/@OneToMany
    @JoinColumn(name ="id_Klienta")
    @JsonIgnore
    public List<Wypozyczenie> wypozyczenie;/*/


    @Override
    public String toString() {
        return "Klient{" +
                "id_klienta=" + id_klienta +
                ", name='" + name + '\'' +
                ", last_name='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                /*/", wypozyczenie=" + wypozyczenie +/*/
                '}';
    }

    public Klient() {
    }
}
