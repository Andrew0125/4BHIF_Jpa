package at.spenger.deu14423.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ss_scanlationStatus database table.
 * 
 */
@Entity
@Table(name="ss_scanlationStatus")
@NamedQuery(name="Ss_scanlationStatus.findAll", query="SELECT s FROM Ss_scanlationStatus s")
public class Ss_scanlationStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String status;

	//bi-directional many-to-one association to MManga
	@OneToMany(mappedBy="ssScanlationStatus")
	private List<MManga> MMangas;

	public Ss_scanlationStatus() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<MManga> getMMangas() {
		return this.MMangas;
	}

	public void setMMangas(List<MManga> MMangas) {
		this.MMangas = MMangas;
	}

	public MManga addMManga(MManga MManga) {
		getMMangas().add(MManga);
		MManga.setSsScanlationStatus(this);

		return MManga;
	}

	public MManga removeMManga(MManga MManga) {
		getMMangas().remove(MManga);
		MManga.setSsScanlationStatus(null);

		return MManga;
	}

}