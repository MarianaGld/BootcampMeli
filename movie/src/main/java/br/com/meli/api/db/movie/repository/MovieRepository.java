package br.com.meli.api.db.movie.repository;

import br.com.meli.api.db.movie.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
