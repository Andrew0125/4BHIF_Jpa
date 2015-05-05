package at.spenger.deu14423.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.Transactional;

import at.spenger.deu14423.jpa.model.AArtist;
import at.spenger.deu14423.jpa.service.AArtistService;

@Import(Config.class)
public class JpaTestApplication implements CommandLineRunner {
	
	@Autowired
	private AArtistService artists;
	
	public static void main(String[] args)
	{
		SpringApplication.run(JpaTestApplication.class, args);
	}
	
	@Override
	@Transactional
	public void run(String... arg0) throws Exception
	{
		
		test();
	}
	
	public void test()
	{
		List<AArtist> list = artists.findByNameLike("MAKI Youko");
		System.out.println("List: " + list + " (" + list.size() + " entries)");
		for (AArtist a : list)
			System.out.println(a);
	}
}
