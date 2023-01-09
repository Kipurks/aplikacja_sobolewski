package com.example.aplikacja_sobolewski.Film;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FilmController {

    public final FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }


    @GetMapping(  "/film")
    public List<Film> getFilm() {
        return filmService.getFilm();
    }
    @GetMapping(  "/film/{id}")
    public Film getSingleFilm(@PathVariable long id) {
        return filmService.getSingleFilm(id);
    }

    @PostMapping("/film")
    public Film createSingleFilm(@RequestBody Film film){ return filmService.createSingleFilm(film);}

    @PutMapping("/film")
    public Film editFilm(@RequestBody Film film) {
        return filmService.editFilm(film);
    }

    @DeleteMapping("/film/{id}")
    public List<Film> deleteFilm(@PathVariable long id) {
        filmService.deleteFilm(id);
        return filmService.getFilm();
    }

}
