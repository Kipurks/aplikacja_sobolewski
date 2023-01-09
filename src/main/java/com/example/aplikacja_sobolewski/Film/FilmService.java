package com.example.aplikacja_sobolewski.Film;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class FilmService {
    public final FilmRepository filmRepository;

    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public List<Film> getFilm () {
    return filmRepository.findAll();
}

    public Film getSingleFilm(long id) {
        return filmRepository.findById(id).orElseThrow();
    }

    public Film createSingleFilm(Film film) { return filmRepository.save(film);
    }

    @Transactional
    public Film editFilm(Film film) {
        Film filmEdited = filmRepository.findById(film.getId()).orElseThrow();
        filmEdited.setTitle(film.getTitle());
        filmEdited.setAuthor(film.getAuthor());
        filmEdited.setYear(film.getYear());
        filmEdited.setDescription(film.getDescription());
        return filmRepository.save(film);
    }

    public void deleteFilm(long id) { filmRepository.deleteById(id);
    }
}
