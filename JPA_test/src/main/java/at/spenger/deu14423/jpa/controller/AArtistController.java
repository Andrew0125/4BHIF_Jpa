package at.spenger.deu14423.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import at.spenger.deu14423.jpa.model.AArtist;
import at.spenger.deu14423.jpa.service.AArtistService;

@Controller
public class AArtistController
{
	@Autowired
	private AArtistService artists;
	
	@RequestMapping(value="/artist", method=RequestMethod.GET)
	@ResponseBody
	public String getArtists()
	{
		StringBuilder ret = new StringBuilder();
		List<AArtist> a = artists.findByNameLike("%");
		
		for (AArtist b : a)
		{
			ret.append(b.toString());
			ret.append('\n');
		}
		
		return ret.toString();
	}
	
	@RequestMapping(value ="/artist/{id}", method=RequestMethod.GET)
	@ResponseBody
	public String getArtist(@PathVariable int id)
	{
		AArtist a = artists.findOne(id);
		if (a != null)
			return a.toString();
		return "User " + id + " does not exist.";
	}
	
	@RequestMapping(value ="/artist", method=RequestMethod.POST)
	@ResponseBody
	public String createArtist(
			@RequestParam(value="name", required=true) String name,
			@RequestParam(value="bakaid", required=false) Integer bakaid)
	{
		AArtist a = new AArtist();
		a.setName(name);
		a.setBakaID(bakaid);
		artists.save(a);
		return a.toString();
	}
	
	@RequestMapping(value ="/artist/{id}", method=RequestMethod.DELETE)
	@ResponseBody
	public String deleteArtist(@PathVariable int id)
	{
		AArtist a = artists.findOne(id);
		if (a != null)
		{
			artists.delete(id);
			return "OK";
		}
		return "User " + id + " does not exist.";
	}
}
