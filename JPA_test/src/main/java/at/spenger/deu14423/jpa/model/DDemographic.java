package at.spenger.deu14423.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the d_demographics database table.
 * 
 */
@Entity
@Table(name="d_demographics")
@NamedQuery(name="DDemographic.findAll", query="SELECT d FROM DDemographic d")
public class DDemographic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String demographic;

	//bi-directional many-to-one association to MManga
	@OneToMany(mappedBy="DDemographic")
	private List<MManga> MMangas;

	public DDemographic() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDemographic() {
		return this.demographic;
	}

	public void setDemographic(String demographic) {
		this.demographic = demographic;
	}

	public List<MManga> getMMangas() {
		return this.MMangas;
	}

	public void setMMangas(List<MManga> MMangas) {
		this.MMangas = MMangas;
	}

	public MManga addMManga(MManga MManga) {
		getMMangas().add(MManga);
		MManga.setDDemographic(this);

		return MManga;
	}

	public MManga removeMManga(MManga MManga) {
		getMMangas().remove(MManga);
		MManga.setDDemographic(null);

		return MManga;
	}

}