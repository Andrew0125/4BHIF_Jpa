package at.spenger.deu14423.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import at.spenger.deu14423.jpa.model.AArtist;
import at.spenger.deu14423.jpa.model.GGenre;
import at.spenger.deu14423.jpa.model.MManga;

@Component("MMangaService")
@Transactional	// Spring provides a transaction manager specifically for JPA.
public class MMangaServiceImpl implements MMangaService {
	
	private final MMangaRepository mangaRepository;
	
	@Autowired
	public MMangaServiceImpl(MMangaRepository mangaRepository) {
		this.mangaRepository = mangaRepository;
	}

	@Override
	@Transactional(readOnly=true)
	public List<MManga> findByTitelLike(String name) {
		return mangaRepository.findByTitelLike(name);
	}
	@Override
	@Transactional(readOnly=true)
	public List<MManga> findByArtist(AArtist artist) {
		return mangaRepository.findByAutor(artist);
	}
	@Override
	@Transactional(readOnly=true)
	public List<MManga> findByGenre(GGenre genre) {
		return genre.getMMangas();
	}
	@Override
	@Transactional(readOnly=true)
	public MManga findOne(int id) {
		return mangaRepository.findOne(id);
	}
	@Override
	public MManga save(MManga a) {
		return mangaRepository.save(a);
	}
	@Override
	public void delete(int id) {
		mangaRepository.delete(id);
	}
	@Override
	@Transactional(readOnly=true)
	public long length() {
		return mangaRepository.count();
	}
	

}
