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
import at.spenger.deu14423.jpa.model.AArtist;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Config.class)
public class AArtistServiceTests
{
	@Autowired
	private AArtistService service;
	
	@Before
	public void setUp() throws Exception
	{
	}
	
	@Test
	public void findOneTest1()
	{
		AArtist a = service.findOne(2);
		assertThat(a.getId(), equalTo(2));
		assertThat(a.getName(), equalTo("MAKI Youko"));
	}
	@Test
	public void findOneTest2()
	{
		AArtist a = service.findOne(3);
		assertThat(a.getId(), equalTo(3));
		assertThat(a.getName(), equalTo("YAGAMI Hiroki"));
	}
	
}
