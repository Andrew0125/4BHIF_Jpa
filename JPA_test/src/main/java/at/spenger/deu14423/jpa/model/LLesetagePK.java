package at.spenger.deu14423.jpa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The primary key class for the l_lesetage database table.
 * 
 */
@Embeddable
public class LLesetagePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="m_manga", insertable=false, updatable=false)
	private int mManga;

	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date datum;

	public LLesetagePK() {
	}
	public int getMManga() {
		return this.mManga;
	}
	public void setMManga(int mManga) {
		this.mManga = mManga;
	}
	public java.util.Date getDatum() {
		return this.datum;
	}
	public void setDatum(java.util.Date datum) {
		this.datum = datum;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other)
			return true;
		if (!(other instanceof LLesetagePK))
			return false;
		LLesetagePK castOther = (LLesetagePK)other;
		return
			(this.mManga == castOther.mManga)
			&& this.datum.equals(castOther.datum);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.mManga;
		hash = hash * prime + this.datum.hashCode();
		
		return hash;
	}
}