package at.spenger.deu14423.jpa.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the g_genres database table.
 * 
 */
@Entity
@Table(name="g_genres")
@NamedQuery(name="GGenre.findAll", query="SELECT g FROM GGenre g")
public class GGenre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String genre;

	//bi-directional many-to-many association to MManga
	@ManyToMany(mappedBy="GGenres",fetch=FetchType.EAGER)
	private List<MManga> MMangas;

	public GGenre() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGenre() {
		return this.genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public List<MManga> getMMangas() {
		return this.MMangas;
	}

	public void setMMangas(List<MManga> MMangas) {
		this.MMangas = MMangas;
	}

}