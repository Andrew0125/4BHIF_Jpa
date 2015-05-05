package at.spenger.deu14423.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import at.spenger.deu14423.jpa.model.AArtist;

@Component("AArtistService")
@Transactional	// Spring provides a transaction manager specifically for JPA.
public class AArtistServiceImpl implements AArtistService {
	private final AArtistRepository artistRepository;
	@Autowired
	public AArtistServiceImpl(AArtistRepository artistRepository) {
		this.artistRepository = artistRepository;
	}

	@Override
	@Transactional(readOnly=true)
	public List<AArtist> findByNameLike(String name) {
		return artistRepository.findByNameLike(name);
	}
	@Override
	@Transactional(readOnly=true)
	public AArtist findOne(int id) {
		return artistRepository.findOne(id);
	}
	@Override
	public AArtist save(AArtist a) {
		return artistRepository.save(a);
	}
	@Override
	public void delete(int id) {
		artistRepository.delete(id);
	}
	@Override
	@Transactional(readOnly=true)
	public long length() {
		return artistRepository.count();
	}
	

}
