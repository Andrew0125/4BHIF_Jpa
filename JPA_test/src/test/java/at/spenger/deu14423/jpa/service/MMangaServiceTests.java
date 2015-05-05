package at.spenger.deu14423.jpa.service;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import at.spenger.deu14423.jpa.Config;
import at.spenger.deu14423.jpa.model.AArtist;
import at.spenger.deu14423.jpa.model.GGenre;
import at.spenger.deu14423.jpa.model.MManga;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Config.class)
public class MMangaServiceTests
{
	@Autowired
	private MMangaService mangas;
	@Autowired
	private AArtistService artists;
	@Autowired
	private GGenreService genres;
	
	@Before
	public void setUp() throws Exception
	{
	}
	
	@Test
	public void findOneTest1()
	{
		MManga a = mangas.findOne(2);
		assertThat(a.getId(), equalTo(2));
		assertThat(a.getTitel(), equalTo("Dear Boys Act II"));
	}
	@Test
	public void findOneTest2()
	{
		MManga m = mangas.findOne(3);
		assertThat(m.getId(), equalTo(3));
		assertThat(m.getTitel(), equalTo("Saratte Watashi no Knight"));
	}
	@Test
	public void findByArtistTest()
	{
		AArtist a = artists.findByNameLike("MAKI Youko").get(0);
		List<MManga> m = mangas.findByArtist(a);
		assertThat(m.get(0).getId(), equalTo(1));
		assertThat(m.get(0).getTitel(), equalTo("Aishiteruze Baby"));
	}
	
	@Test
	public void findByGenreTest1()
	{
		GGenre g = genres.findByNameLike("Comedy");
		List<MManga> m = mangas.findByGenre(g);
		assertThat(m.get(0).getId(), equalTo(1));
		assertThat(m.get(0).getTitel(), equalTo("Aishiteruze Baby"));
	}
	@Test
	public void findByGenreTest2()
	{
		GGenre g = genres.findByNameLike("Drama");
		List<MManga> m = mangas.findByGenre(g);
		assertThat(m.get(0).getId(), equalTo(1));
		assertThat(m.get(0).getTitel(), equalTo("Aishiteruze Baby"));
		assertThat(m.get(1).getId(), equalTo(3));
		assertThat(m.get(1).getTitel(), equalTo("Saratte Watashi no Knight"));
		assertThat(m.get(2).getId(), equalTo(5));
		assertThat(m.get(2).getTitel(), equalTo("Ryuurouden"));
	}
	
}
