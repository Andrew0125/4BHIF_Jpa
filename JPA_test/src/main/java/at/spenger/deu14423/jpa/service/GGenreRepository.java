package at.spenger.deu14423.jpa.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import at.spenger.deu14423.jpa.model.GGenre;

public interface GGenreRepository extends CrudRepository<GGenre, Integer>
{
	@Override
	List<GGenre> findAll();
	@Query("select g from GGenre g where g.genre like :genre")
	GGenre findByNameLike(@Param("genre") String genre);
}
