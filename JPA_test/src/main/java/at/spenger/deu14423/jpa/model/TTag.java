package at.spenger.deu14423.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the t_tags database table.
 * 
 */
@Entity
@Table(name="t_tags")
@NamedQuery(name="TTag.findAll", query="SELECT t FROM TTag t")
public class TTag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String tag;

	//bi-directional many-to-many association to MManga
	@ManyToMany
	@JoinTable(
		name="m_t_mangas_have_tags"
		, joinColumns={
			@JoinColumn(name="t_tag")
			}
		, inverseJoinColumns={
			@JoinColumn(name="m_manga")
			}
		)
	private List<MManga> MMangas;

	public TTag() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public List<MManga> getMMangas() {
		return this.MMangas;
	}

	public void setMMangas(List<MManga> MMangas) {
		this.MMangas = MMangas;
	}

}