package at.spenger.deu14423.jpa.service;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import at.spenger.deu14423.jpa.Config;
import at.spenger.deu14423.jpa.model.GGenre;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Config.class)
public class GGenreServiceTests
{
	@Autowired
	private GGenreService service;
	
	@Before
	public void setUp() throws Exception
	{
	}
	
	@Test
	public void findOneTest1()
	{
		GGenre a = service.findOne(2);
		assertThat(a.getId(), equalTo(2));
		assertThat(a.getGenre(), equalTo("Drama"));
	}
	@Test
	public void findOneTest2()
	{
		GGenre a = service.findOne(3);
		assertThat(a.getId(), equalTo(3));
		assertThat(a.getGenre(), equalTo("Romance"));
	}
	
}
