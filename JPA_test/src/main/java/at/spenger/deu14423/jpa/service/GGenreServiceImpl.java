package at.spenger.deu14423.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import at.spenger.deu14423.jpa.model.GGenre;

@Component("GGenreService")
@Transactional	// Spring provides a transaction manager specifically for JPA.
public class GGenreServiceImpl implements GGenreService {
	private final GGenreRepository genreRepository;
	@Autowired
	public GGenreServiceImpl(GGenreRepository genreRepository) {
		this.genreRepository = genreRepository;
	}
	@Override
	public List<GGenre> findAll() {
		return genreRepository.findAll();
	}
	@Override
	@Transactional(readOnly=true)
	public GGenre findByNameLike(String genre) {
		return genreRepository.findByNameLike(genre);
	}
	@Override
	@Transactional(readOnly=true)
	public GGenre findOne(int id) {
		return genreRepository.findOne(id);
	}
	@Override
	public GGenre save(GGenre a) {
		return genreRepository.save(a);
	}
	@Override
	public void delete(int id) {
		genreRepository.delete(id);
	}
	@Override
	@Transactional(readOnly=true)
	public long length() {
		return genreRepository.count();
	}
	

}
