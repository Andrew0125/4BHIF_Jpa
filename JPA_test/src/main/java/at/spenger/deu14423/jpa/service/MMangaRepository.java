package at.spenger.deu14423.jpa.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import at.spenger.deu14423.jpa.model.AArtist;
import at.spenger.deu14423.jpa.model.MManga;

public interface MMangaRepository extends CrudRepository<MManga, Integer>
{
	@Query("select a from MManga a where a.titel like :titel")
	List<MManga> findByTitelLike(@Param("titel") String titel);
	@Query("select a from MManga a where a.AArtist1 like :artist")
	List<MManga> findByAutor(@Param("artist") AArtist artist);
	@Query("select a from MManga a where a.AArtist2 like :artist")
	List<MManga> findByZeichner(@Param("artist") AArtist artist);
}
