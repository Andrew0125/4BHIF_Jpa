package at.spenger.deu14423.jpa.service;

import java.util.List;

import at.spenger.deu14423.jpa.model.AArtist;

public interface AArtistService
{
	List<AArtist> findByNameLike(String name);
	AArtist findOne(int id);
	AArtist save(AArtist a);
	void delete(int id);
	long length();
}
