package at.spenger.deu14423.jpa.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import at.spenger.deu14423.jpa.model.AArtist;

public interface AArtistRepository extends CrudRepository<AArtist, Integer>
{
	@Query("select a from AArtist a where a.name like :name")
	List<AArtist> findByNameLike(@Param("name") String name);
}
