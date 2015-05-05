package at.spenger.deu14423.jpa.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the l_lesetage database table.
 * 
 */
@Entity
@Table(name="l_lesetage")
@NamedQuery(name="LLesetage.findAll", query="SELECT l FROM LLesetage l")
public class LLesetage implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private LLesetagePK id;

	private int seiten;

	private String wasgelesen;

	//bi-directional many-to-one association to MManga
	@ManyToOne
	@JoinColumn(name="m_manga", insertable=false, updatable=false)
	private MManga MManga;

	public LLesetage() {
	}

	public LLesetagePK getId() {
		return this.id;
	}

	public void setId(LLesetagePK id) {
		this.id = id;
	}

	public int getSeiten() {
		return this.seiten;
	}

	public void setSeiten(int seiten) {
		this.seiten = seiten;
	}

	public String getWasgelesen() {
		return this.wasgelesen;
	}

	public void setWasgelesen(String wasgelesen) {
		this.wasgelesen = wasgelesen;
	}

	public MManga getMManga() {
		return this.MManga;
	}

	public void setMManga(MManga MManga) {
		this.MManga = MManga;
	}

}