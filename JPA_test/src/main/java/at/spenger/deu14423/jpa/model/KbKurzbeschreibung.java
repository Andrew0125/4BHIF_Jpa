package at.spenger.deu14423.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the kb_kurzbeschreibung database table.
 * 
 */
@Entity
@Table(name="kb_kurzbeschreibung")
@NamedQuery(name="KbKurzbeschreibung.findAll", query="SELECT k FROM KbKurzbeschreibung k")
public class KbKurzbeschreibung implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String beschreibung;

	//bi-directional many-to-one association to MManga
	@OneToMany(mappedBy="kbKurzbeschreibungBean")
	private List<MManga> MMangas;

	public KbKurzbeschreibung() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBeschreibung() {
		return this.beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public List<MManga> getMMangas() {
		return this.MMangas;
	}

	public void setMMangas(List<MManga> MMangas) {
		this.MMangas = MMangas;
	}

	public MManga addMManga(MManga MManga) {
		getMMangas().add(MManga);
		MManga.setKbKurzbeschreibungBean(this);

		return MManga;
	}

	public MManga removeMManga(MManga MManga) {
		getMMangas().remove(MManga);
		MManga.setKbKurzbeschreibungBean(null);

		return MManga;
	}

}