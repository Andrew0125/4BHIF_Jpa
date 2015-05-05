package at.spenger.deu14423.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the sg_scanlationGroups database table.
 * 
 */
@Entity
@Table(name="sg_scanlationGroups")
@NamedQuery(name="Sg_scanlationGroup.findAll", query="SELECT s FROM Sg_scanlationGroup s")
public class Sg_scanlationGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private byte active;

	@Column(name="baka_id")
	private int bakaId;

	private Timestamp createdDate;

	private String homepage;

	private Timestamp modifiedDate;

	private String name;

	//bi-directional many-to-many association to MManga
	@ManyToMany
	@JoinTable(
		name="m_sg_mangas_have_scanlationGroups"
		, joinColumns={
			@JoinColumn(name="sg_scanlationGroup")
			}
		, inverseJoinColumns={
			@JoinColumn(name="m_manga")
			}
		)
	private List<MManga> MMangas;

	public Sg_scanlationGroup() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public int getBakaId() {
		return this.bakaId;
	}

	public void setBakaId(int bakaId) {
		this.bakaId = bakaId;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getHomepage() {
		return this.homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public Timestamp getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<MManga> getMMangas() {
		return this.MMangas;
	}

	public void setMMangas(List<MManga> MMangas) {
		this.MMangas = MMangas;
	}

}