package at.spenger.deu14423.jpa.service;

import java.util.List;

import at.spenger.deu14423.jpa.model.GGenre;

public interface GGenreService
{
	List<GGenre> findAll();
	GGenre findByNameLike(String genre);
	GGenre findOne(int id);
	GGenre save(GGenre g);
	void delete(int id);
	long length();
}
