package com.example.aplikacja_sobolewski.Film;

import com.example.aplikacja_sobolewski.Wypozyczenie.Wypozyczenie;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Film {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "film_gen")
    @SequenceGenerator(name = "film_gen", sequenceName = "film_seq_1", allocationSize = 1)
    public long id;
    public String title;
    @JsonFormat(pattern = "yyyy-MM-dd")
    public LocalDate year;
    public String author;
    public String description;

   /*/ @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id_Filmu")
    @JsonIgnore
    public List<Wypozyczenie> wypozyczenie;/*/

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

   /*/ public List<Wypozyczenie> getWypozyczenie() {
        return wypozyczenie;
    }

    public void setWypozyczenie(List<Wypozyczenie> wypozyczenie) {
        this.wypozyczenie = wypozyczenie;
    }/*/

    @Override
    public String toString() {
        return "Film{" +
                "Id=" + id +
                ", Title='" + title + '\'' +
                ", Year=" + year +
                ", Author='" + author + '\'' +
                /*/", wypozyczenie=" + wypozyczenie +/*/
                '}';
    }

    public Film() {
    }


}

