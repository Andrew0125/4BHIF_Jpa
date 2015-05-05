package at.spenger.deu14423.jpa.service;

import java.util.List;

import at.spenger.deu14423.jpa.model.AArtist;
import at.spenger.deu14423.jpa.model.GGenre;
import at.spenger.deu14423.jpa.model.MManga;

public interface MMangaService
{
	List<MManga> findByTitelLike(String titel);
	List<MManga> findByArtist(AArtist artist);
	List<MManga> findByGenre(GGenre genre);
	MManga findOne(int id);
	MManga save(MManga a);
	void delete(int id);
	long length();
}
