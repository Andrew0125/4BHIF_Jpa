package at.spenger.deu14423.jpa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * The persistent class for the d_doujinshis database table.
 * 
 */
@Entity
@Table(name="d_doujinshis")
@NamedQuery(name="DDoujinshi.findAll", query="SELECT d FROM DDoujinshi d")
public class DDoujinshi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="m_manga")
	private int mManga;

	private byte ab18;

	@Column(name="charas_pairings")
	private String charasPairings;

	//bi-directional many-to-one association to FFandom
	@ManyToOne
	@JoinColumn(name="f_fandom")
	private FFandom FFandom;

	//bi-directional one-to-one association to MManga
	@OneToOne
	@JoinColumn(name="m_manga")
	private MManga MManga;

	public DDoujinshi() {
	}

	public int getMMangaID() {
		return this.mManga;
	}

	public void setMManga(int mManga) {
		this.mManga = mManga;
	}

	public byte getAb18() {
		return this.ab18;
	}

	public void setAb18(byte ab18) {
		this.ab18 = ab18;
	}

	public String getCharasPairings() {
		return this.charasPairings;
	}

	public void setCharasPairings(String charasPairings) {
		this.charasPairings = charasPairings;
	}

	public FFandom getFFandom() {
		return this.FFandom;
	}

	public void setFFandom(FFandom FFandom) {
		this.FFandom = FFandom;
	}

	public MManga getMManga() {
		return this.MManga;
	}

	public void setMManga(MManga MManga) {
		this.MManga = MManga;
	}

}